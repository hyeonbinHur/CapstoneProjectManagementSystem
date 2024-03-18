const currUser = JSON.parse(sessionStorage.getItem('user'));
const capstoneLogo = document.querySelector('#logo');
const submitBtn = document.querySelector('#submit-btn');
// const supervisorSelect = document.querySelector('#supervisor-select');
async function updateUI() {}
function dataURItoBlob(dataURI) {
  const byteString = atob(dataURI.split(',')[1]);
  const mimeString = dataURI.split(',')[0].split(':')[1].split(';')[0];
  const ab = new ArrayBuffer(byteString.length);
  const ia = new Uint8Array(ab);
  for (let i = 0; i < byteString.length; i++) {
    ia[i] = byteString.charCodeAt(i);
  }
  return new Blob([ab], { type: mimeString });
}
async function setCapstoneImage(capstoneProject) {
  const fileInput = document.querySelector('#logo');
  if (fileInput.files.length === 0) {
    await fetch('/api/capstone-project', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(capstoneProject),
    });
    await fetch('/company');
    return;
  }

  const file = fileInput.files[0];
  const reader = new FileReader();

  reader.onload = () => {
    const image = new Image();

    image.onload = () => {
      const canvas = document.createElement('canvas');
      canvas.width = 300;
      canvas.height = 300;
      const context = canvas.getContext('2d');
      context.drawImage(image, 0, 0, 300, 300);
      const compressedImageData = canvas.toDataURL('image/jpeg', 0.5);

      const formData = new FormData();
      formData.append('file', dataURItoBlob(compressedImageData));

      fetch('/api/images', {
        method: 'POST',
        body: formData,
      })
        .then((response) => {
          return response.json();
        })
        .then((data) => {
          capstoneProject.imageId = data.id;

          return capstoneProject;
        })
        .then((capstoneProject) => {
          fetch('/api/capstone-project', {
            method: 'POST',
            headers: {
              'Content-Type': 'application/json',
            },
            body: JSON.stringify(capstoneProject),
          })
            .then((response) => {})
            .then((data) => {
              window.location.href = 'company-main-page.html';
            });
        })

        .catch((error) => {
          console.error(error);
        });
    };

    image.src = reader.result;
    reader.readAsDataURL(file);
  };

  return capstoneProject;
}
async function setCapstoneProject() {
  const capstoneProject = {
    company: {
      username: currUser.username,
    },
    supervisor: {
      // username: supervisorSelect.value
    },
    projectTitle: document.querySelector('#capstone-title').value,
    projectIntroduction: document.querySelector('#introduction').value,
    projectObjectives: document.querySelector('#capstone-objectives').value,
    projectSuccessCriteria: document.querySelector('#success-criteria').value,
    technicalRequirements: document.querySelector('#capstone-requirements')
      .value,
    projectDescription: document.querySelector('#capstone-description').value,
    academicBackground: document.querySelector('#academic-background').value,
    noStudents: document.querySelector('#no-students').value,
    interviewReqs: document.querySelector('#interview-reqs').value,
    multiTeamAllow: document.querySelector('#multi-team').value,
    capstoneStatus: 'pending',
    imageId: '',
  };
  const res = await setCapstoneImage(capstoneProject);
}

submitBtn.addEventListener('click', async (event) => {
  event.preventDefault();
  const alertModal = document.querySelector('#alert-modal');
  const createCapstoneModalEl = document.querySelector(
    '.modal-dialog-scrollable'
  );
  createCapstoneModalEl.querySelector('.btn-close').click();
  updateLoadingModal('Creating capstone project...', alertModal);

  try {
    await setCapstoneProject();
    updateSuccessModal(
      'Capstone project created successfully.',
      alertModal,
      () => {
        window.location.reload();
      }
    );
  } catch (error) {
    updateDangerModal('Failed to create capstone project.', alertModal, () => {
      window.location.reload();
    });
  }
});

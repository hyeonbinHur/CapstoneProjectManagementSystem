package com.example.EEET2580_Group.Controller;

import com.example.EEET2580_Group.DTO.GroupDto;
import com.example.EEET2580_Group.Entity.GroupEntity;
import com.example.EEET2580_Group.Entity.StudentAcc;
import com.example.EEET2580_Group.Repository.StudentAccRepository;
import com.example.EEET2580_Group.Service.Interface.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/group")
public class GroupController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private StudentAccRepository studentAccRepository;

    @PutMapping()
    public void updateGroup (@RequestBody GroupDto groupDto ){
        System.out.println(groupDto);
        this.groupService.updateGroup(groupDto);
    }

    @PostMapping()
    public void addGroup (@RequestBody GroupDto groupDto ){
        this.groupService.saveGroup(groupDto);
    }
    @GetMapping("/search")
    public Page<GroupDto> getAllGroup (@RequestParam(name = "group_name",defaultValue = "") String groupName,
                                    @RequestParam(name = "page",defaultValue = "0") String page,
                                    @RequestParam(name = "size",defaultValue = "6") String size,
                                    @RequestParam(name = "sort",defaultValue = "asc") String sort){
        Pageable pageable = null;
        if (sort.equals("desc")) {
            pageable = PageRequest.of(Integer.parseInt(page), Integer.parseInt(size), Sort.by("id").descending());
        } else {
            pageable = PageRequest.of(Integer.parseInt(page), Integer.parseInt(size), Sort.by("id").ascending());
        }
        Page<GroupEntity> result =  groupService.getAllGroup(groupName, pageable);
        Page<GroupDto> dtoConvert = result.map(object -> new GroupDto(object));
        return dtoConvert;
    }
    @GetMapping("/id/{groupId}")
    public GroupDto getGroup (@PathVariable Long groupId){
        return new GroupDto(this.groupService.findGroupById(groupId));
    }
    @GetMapping("/{studentId}")
    public GroupDto getStudentsInGroup (@PathVariable Long studentId){
       StudentAcc student =  studentAccRepository.findById(studentId).get();
       GroupEntity group = student.getGroup();
       return group == null? new GroupDto(): new GroupDto(group);
    }
    @GetMapping("/capstone/{capstoneId}")
    public Page<GroupDto> getGroupByCapstone (@PathVariable Long capstoneId,
    @RequestParam(name = "page",defaultValue = "0") String page,
                                        @RequestParam(name = "size",defaultValue = "6") String size){
        Pageable pageable = PageRequest.of(Integer.parseInt(page), Integer.parseInt(size), Sort.by("id").ascending());
        Page<GroupDto> group = this.groupService.findGroupByCapstoneProjectId(capstoneId,pageable).map(object -> new GroupDto(object));
        return group;
    }

}

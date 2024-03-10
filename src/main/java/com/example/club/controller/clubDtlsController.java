package com.example.club.controller;

import com.example.club.exception.ResourceNotFoundException;
import com.example.club.model.ManagerDetails;
import com.example.club.model.PlayerDtls;
import com.example.club.model.club_dtls;
import com.example.club.repository.ManagerDtlsRepository;
import com.example.club.repository.PlayerDtlsRepository;
import com.example.club.repository.clubDtlsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class clubDtlsController {
    @Autowired
    private clubDtlsRepository culbdtlsrepository;

    @Autowired
    private PlayerDtlsRepository playerDtlsRepository;

    @Autowired
    private ManagerDtlsRepository ManagerDtlsRepository;

    @GetMapping("get/club")
    public List<club_dtls> getAllClubDtls(){
        return culbdtlsrepository.findAll();
    }

    @GetMapping("get/player")
    public List<PlayerDtls> getAllPlayerDtls(){return playerDtlsRepository.findAll();
    }

    @GetMapping("get/manager")
    public  List<ManagerDetails> getAllManagerDtls(){return ManagerDtlsRepository.findAll();

    }


    // build create employee REST API
    @PostMapping("/save/club")
    public club_dtls createEmployee(@RequestBody club_dtls clubdtls) {
        return culbdtlsrepository.save(clubdtls);
    }

    @PostMapping("/save/player")
    public PlayerDtls createPlayers(@RequestBody PlayerDtls playerDtls) {
        return playerDtlsRepository.save(playerDtls);
    }

    @PostMapping("/save/manager")
    public ManagerDetails createManager(@RequestBody ManagerDetails managerDtls){
        return ManagerDtlsRepository.save(managerDtls);
    }



    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<club_dtls> getEmployeeById(@PathVariable  int id){
        club_dtls clubdtls = culbdtlsrepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(clubdtls);
    }

    // build update employee REST API
   /* @PutMapping("{id}")
    public ResponseEntity<club_dtls> updateClubDtls(@PathVariable int id,@RequestBody club_dtls clubDtls) {
        club_dtls updateClubDtls = culbdtlsrepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        updateClubDtls.setClub_name(clubDtls.ge);
        updateClubDtls.setLastName(clubDtls.getLastName());
        updateClubDtls.setEmailId(clubDtls.getEmailId());



        culbdtlsrepository.save(updateClubDtls);

        return ResponseEntity.ok(updateClubDtls);
    }*/

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id){

        club_dtls clubdtls = culbdtlsrepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Club not exist with id: " + id));

        culbdtlsrepository.delete(clubdtls);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }




}

package com.example.club.controller;

import com.example.club.exception.ResourceNotFoundException;
import com.example.club.model.club_dtls;
import com.example.club.repository.clubDtlsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/club")
@CrossOrigin("*")
public class clubDtlsController {
    @Autowired
    private clubDtlsRepository culbdtlsrepository;

    @GetMapping("/get")
    public List<club_dtls> getAllClubDtls(){
        return culbdtlsrepository.findAll();
    }

    // build create employee REST API
    @PostMapping
    public club_dtls createEmployee(@RequestBody club_dtls clubdtls) {
        return culbdtlsrepository.save(clubdtls);
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

package cz.whadoo.connectgov.controller

import cz.whadoo.connectgov.model.Municipality
import cz.whadoo.connectgov.service.MunicipalityService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/municipalities")
@CrossOrigin("*")
class AdminController(private val municipalityService: MunicipalityService) {

    @GetMapping
    fun getMunicipalities(): ResponseEntity<Any> {
        return ResponseEntity(municipalityService.getMunicipalities(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getMunicipality(@PathVariable id: Int): ResponseEntity<Any> {
        return ResponseEntity(municipalityService.getMunicipalities().find { it.municipalityCode == id }, HttpStatus.OK)
    }

    @PostMapping
    fun saveMunicipalities(@RequestBody municipalities: List<Municipality>): ResponseEntity<Any> {
        municipalityService.saveMunicipalities(municipalities)
        return ResponseEntity(municipalities, HttpStatus.OK)
    }

    @PostMapping("/{id}")
    fun saveMunicipality(@PathVariable id: Int, @RequestBody municipality: Municipality): ResponseEntity<Any> {
        val municipalities = municipalityService.getMunicipalities().toMutableList()

        val index = municipalities.indexOfFirst { it.municipalityCode == id }

        municipalities[index] = municipality

        municipalityService.saveMunicipalities(municipalities)
        return ResponseEntity(municipality, HttpStatus.OK)
    }

    @PostMapping("/queue")
    fun queue(@RequestBody data: Map<String, Any>): ResponseEntity<Any> {
        municipalityService.queue(data)
        return ResponseEntity(HttpStatus.OK)
    }
}

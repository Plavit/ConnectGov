package cz.whadoo.connectgov.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Municipality(
        val name: String,
        val municipality: String,
//        @JsonProperty("Unemployment Index")
        val unemploymentIndex: Double,
        val emissions: Double,
//        @JsonProperty("Men Life Expectancy")
        val menLifeExpectancy: Double,
//        @JsonProperty("Divorce Rate")
        val divorceRate: Double,
//        @JsonProperty("Kindergarten Accessibility")
        val kindergartenAccessibility: Double,
//        @JsonProperty("High School Accessibility")
        val highSchoolAccessibility: Double,
//        @JsonProperty("Healthcare Accessibility")
        val healthcareAccessibility: Double,
//        @JsonProperty("Confiscation Rate")
        val confiscationRate: Double,
//        @JsonProperty("Industrial Index")
        val industrialIndex: Double,
//        @JsonProperty("Safety Index")
        val safetyIndex: Double,
//        @JsonProperty("Internet Accessibility")
        val internetAccessibility: Double,
        val lat: Double,
        val lon: Double,
        val mayor: String,
        val phone: String,
        val email: String,
//        @JsonProperty("Municipality Code")
        val municipalityCode: Int,
//        @JsonProperty("Cultural Inheritance")
        val culturalInheritance: Int,
//        @JsonProperty("Unemployment Rate")
        val unemploymentRate: Double,
//        @JsonProperty("Number Of Inhabitants")
        val numberOfInhabitants: Double,
//        @JsonProperty("Elderly People")
        val elderlyPeople: Double,
//        @JsonProperty("Abandoned Buildings")
        val abandonedBuildings: Double,
//        @JsonProperty("Voter Turnout")
        val voterTurnout: Double
)

/*
        val Name: String,
        val Municipality: String,
//        @JsonProperty("Unemployment Index")
        val UnemploymentIndex: Double,
        val Emissions: Double,
//        @JsonProperty("Men Life Expectancy")
        val MenLifeExpectancy: Double,
//        @JsonProperty("Divorce Rate")
        val DivorceRate: Double,
//        @JsonProperty("Kindergarten Accessibility")
        val KindergartenAccessibility: Double,
//        @JsonProperty("High School Accessibility")
        val HighSchoolAccessibility: Double,
//        @JsonProperty("Healthcare Accessibility")
        val HealthcareAccessibility: Double,
//        @JsonProperty("Confiscation Rate")
        val ConfiscationRate: Double,
//        @JsonProperty("Industrial Index")
        val IndustrialIndex: Double,
//        @JsonProperty("Safety Index")
        val SafetyIndex: Double,
//        @JsonProperty("Internet Accessibility")
        val InternetAccessibility: Double,
        val lat: Double,
        val lon: Double,
        val Mayor: String,
        val Phone: String,
        val Email: String,
//        @JsonProperty("Municipality Code")
        val MunicipalityCode: Int,
//        @JsonProperty("Cultural Inheritance")
        val CulturalInheritance: Int,
//        @JsonProperty("Unemployment Rate")
        val UnemploymentRate: Double,
//        @JsonProperty("Number Of Inhabitants")
        val NumberOfInhabitants: Double,
//        @JsonProperty("Elderly People")
        val ElderlyPeople: Double,
//        @JsonProperty("Abandoned Buildings")
        val AbandonedBuildings: Double,
//        @JsonProperty("Voter Turnout")
        val VoterTurnout: Double
* */

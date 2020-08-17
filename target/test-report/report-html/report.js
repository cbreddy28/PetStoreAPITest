$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Pets/PS001FindPetByStatus.feature");
formatter.feature({
  "line": 2,
  "name": "Find all pet by status",
  "description": "As an aspiring pet owner\r\nI want to find some pet from this app\r\nSo I can buy one of them",
  "id": "find-all-pet-by-status",
  "keyword": "Feature"
});
formatter.before({
  "duration": 845367260,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Find a pet by Status - Available",
  "description": "",
  "id": "find-all-pet-by-status;find-a-pet-by-status---available",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@FindPetByStatus"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I have access to pet service",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I find pet by availability",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the pet is available",
  "keyword": "Then "
});
formatter.match({
  "location": "FindPetSteps.iHaveAccessToPetService()"
});
formatter.result({
  "duration": 636266858,
  "status": "passed"
});
formatter.match({
  "location": "FindPetSteps.iFindPetByAvailability()"
});
formatter.result({
  "duration": 1570672804,
  "status": "passed"
});
formatter.match({
  "location": "FindPetSteps.thePetIsAvailable()"
});
formatter.result({
  "duration": 174504966,
  "error_message": "java.lang.AssertionError: expected:\u003c190\u003e but was:\u003c192\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:645)\n\tat org.junit.Assert.assertEquals(Assert.java:631)\n\tat com.petstore.api.steps.FindPetSteps.thePetIsAvailable(FindPetSteps.java:42)\n\tat ✽.Then the pet is available(Features/Pets/PS001FindPetByStatus.feature:11)\n",
  "status": "failed"
});
});
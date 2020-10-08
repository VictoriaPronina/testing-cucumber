$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SignIn.feature");
formatter.feature({
  "name": "Registation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInStepDefs.i_am_on_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "SignIn as a Manager (free user)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test2"
    }
  ]
});
formatter.step({
  "name": "I SignIn as a manager",
  "keyword": "When "
});
formatter.match({
  "location": "SignInStepDefs.i_SignIn_as_a_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStepDefs.i_am_on_the_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
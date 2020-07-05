$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/firstScenario.feature");
formatter.feature({
  "name": "AddProduct",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding_Lowest_Price_Product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@useCase1"
    }
  ]
});
formatter.step({
  "name": "User is at the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.UseCase1Test.user_is_at_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to popular items section",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.UseCase1Test.user_navigated_to_popular_items_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add lowest price product",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.UseCase1Test.add_lowest_price_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.UseCase1Test.navigated_to_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Screenshot has been taken",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.UseCase1Test.screenshot_has_been_taken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that product has been added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.UseCase1Test.verify_that_product_has_been_added_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/secondScenario.feature");
formatter.feature({
  "name": "Dicount",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "DiscountCheck",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@useCase2"
    }
  ]
});
formatter.step({
  "name": "User is at the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.UseCase1Test.user_is_at_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to popular items section",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.UseCase1Test.user_navigated_to_popular_items_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check number of items with discount",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.USeCase2.check_number_of_items_with_discount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that final price after discount is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.USeCase2.verify_that_final_price_after_discount_is_correct()"
});
formatter.result({
  "status": "passed"
});
});
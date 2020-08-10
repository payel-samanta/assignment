$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenario.feature");
formatter.feature({
  "line": 1,
  "name": "DBS Stronger Together Fund Report",
  "description": "",
  "id": "dbs-stronger-together-fund-report",
  "keyword": "Feature"
});
formatter.before({
  "duration": 460200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Read and write the table in excel sheet",
  "description": "",
  "id": "dbs-stronger-together-fund-report;read-and-write-the-table-in-excel-sheet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicked on Learn More button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "scroll down and navigate to Singapore on the left panel",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Read and write the table in excel sheet",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_landing_page()"
});
formatter.result({
  "duration": 10880518200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicked_on_learn_more_button()"
});
formatter.result({
  "duration": 2320397500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.scroll_down_and_navigate_to_singapore_on_the_left_panel()"
});
formatter.result({
  "duration": 1646301700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.read_and_write_the_table_in_excel_sheet()"
});
formatter.result({
  "duration": 3204525300,
  "status": "passed"
});
formatter.before({
  "duration": 97600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validate the total number of awards displayed on the page is 22, Validate all the award name and caption of the awards mentioned",
  "description": "and print in the cucumber report in the form of a table",
  "id": "dbs-stronger-together-fund-report;validate-the-total-number-of-awards-displayed-on-the-page-is-22,-validate-all-the-award-name-and-caption-of-the-awards-mentioned",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user clicked on Learn More button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicked on About button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "clicked on Who we are tab",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "clicked on Our Awards \u0026 Accolades",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Validate the total number of awards displayed on the page is 22",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Validate all the award name and caption of the awards with following data",
  "rows": [
    {
      "cells": [
        "A World First",
        "Euromoney"
      ],
      "line": 19
    },
    {
      "cells": [
        "The Banker",
        "Bank of the Year 2018"
      ],
      "line": 20
    },
    {
      "cells": [
        "Global Finance",
        "Best Bank in the World 2018"
      ],
      "line": 21
    },
    {
      "cells": [
        "Euromoney",
        "Awards For Excellence"
      ],
      "line": 22
    },
    {
      "cells": [
        "Global Finance",
        "World\u0027s Best Banks"
      ],
      "line": 23
    },
    {
      "cells": [
        "Global Finance",
        "World\u0027s Best Investment Banks and Derivatives Providers"
      ],
      "line": 24
    }
  ],
  "keyword": "But "
});
formatter.step({
  "line": 25,
  "name": "print in the cucumber report in the form of a table",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_is_on_landing_page()"
});
formatter.result({
  "duration": 1432142700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicked_on_learn_more_button()"
});
formatter.result({
  "duration": 1440132700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicked_on_About_button()"
});
formatter.result({
  "duration": 1420471900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.clicked_on_Who_we_are_tab()"
});
formatter.result({
  "duration": 2235532700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.clicked_on_Our_Awards_Accolades()"
});
formatter.result({
  "duration": 2986929000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22",
      "offset": 61
    }
  ],
  "location": "stepDef.validate_the_total_number_of_awards_displayed_on_the_page_is(int)"
});
formatter.result({
  "duration": 635166700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.validate_all_the_award_name_and_caption_of_the_awards_with_following_data(DataTable)"
});
formatter.write("validation failed for A World First");
formatter.write("validation failed for Euromoney");
formatter.result({
  "duration": 2701906700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.print_in_the_cucumber_report_in_the_form_of_a_table()"
});
formatter.write("Euromoney | World\u0027s Best Bank 2019");
formatter.write("The Banker | Bank of the Year 2018");
formatter.write("Global Finance | Best Bank in the World 2018");
formatter.write("Euromoney | Awards For Excellence");
formatter.write("Global Finance | World\u0027s Best Banks");
formatter.write("Global Finance | World\u0027s Best Investment Banks and Derivatives Providers");
formatter.write("Global Finance | World\u0027s Best Treasury and Cash Management Banks and Providers");
formatter.write("Global Finance | Trade Finance and Supply Chain Finance Awards");
formatter.write("Global Finance | Best Sub-Custodian Banks");
formatter.write("Global Finance | World\u0027s Best Private Bank Awards");
formatter.write("The Asset | Treasury, Trade, Sustainable Supply Chain and Risk Management Awards");
formatter.write("Asiamoney | Private Banking Awards");
formatter.write("Hackett Group | Digital Awards");
formatter.write("Hackett Group | Digital Awards");
formatter.write("Global Finance | Foreign Exchange Awards");
formatter.write("Global Finance | Trade Finance and Supply Chain Finance Awards");
formatter.write("Global Finance | World\u0027s Best Private Bank Awards");
formatter.write("Global Finance | The Innovators");
formatter.write("Global Finance | World\u0027s Best Private Bank Awards");
formatter.write("Bloomberg | Gender Equality Index");
formatter.write("Euromoney | Awards for Excellence");
formatter.write("Global Finance | World\u0027s Best Investment Banks and Derivatives Providers");
formatter.result({
  "duration": 1455267900,
  "status": "passed"
});
});
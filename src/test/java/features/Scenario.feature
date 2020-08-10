Feature: DBS Stronger Together Fund Report


Scenario: Read and write the table in excel sheet
Given user is on landing page
When user clicked on Learn More button 
And scroll down and navigate to Singapore on the left panel
Then Read and write the table in excel sheet

Scenario: Validate the total number of awards displayed on the page is 22, Validate all the award name and caption of the awards mentioned
and print in the cucumber report in the form of a table
Given user is on landing page
When user clicked on Learn More button 
And user clicked on About button
And clicked on Who we are tab
And clicked on Our Awards & Accolades 
Then Validate the total number of awards displayed on the page is 22
But Validate all the award name and caption of the awards with following data
|A World First|Euromoney|
|The Banker|Bank of the Year 2018|
|Global Finance|Best Bank in the World 2018|
|Euromoney|Awards For Excellence|
|Global Finance|World's Best Banks|
|Global Finance|World's Best Investment Banks and Derivatives Providers|
And print in the cucumber report in the form of a table



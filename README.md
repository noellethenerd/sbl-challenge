# SBL Deduplication Coding Challenge

Deduplicate DNA sequences provided by API, and allow user to view possible thresholded matches as well.

## Backend: Spring Boot & Java

Here is where our DNA sequences live, are modified, and are served.

To launch at http://localhost:8080

`./mvnw spring-boot:run`

Note: May need to adjust environment settings/update java/maven

## Frontend: React.js

In /app we launch a frontend UI so users can view, manipulate, and compare DNA sequences.

Served at http://localhost:3000

`npm start`

Note: May need to cd app and npm i to install packages

## TODO

[x] Link API

[x] Display DNA sequences

[x] Add threshold logic

[x] Publish to Github

[ ] Add user interactions

[ ] API: /post endpoint for users to upload sequences

[ ] Formatting: Better user display

[ ] Add robust testing
# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Quick summary
Automates generation of rules (Business Logics) for Drools. 

Flow of the Program:
i. Parses the expressions provided as a csv format - Data present in readable format, not involving any logic or syntax.
ii. Conversion of data into syntactically correct form as required by the Drools Rule Engine.
iii. Writes the syntactically well formed code into a (.drl) Drools file.
iv. The rules file can now be fed into a rule engine.
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

* Summary of set up
ANTLR was used for parsing. It requires a grammar design, present as SimpleBoolean.g4 under resources, to evaluate complex boolean expressions.
Resources generated for the file must be placed under the source folder.
* Configuration
* Dependencies
Check build.gradle
* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact
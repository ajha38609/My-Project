#""" (Doc Strings)
## This is used when we have to write 2-3 lines of text in the feature file,
## Instead of writing it in a single line, you can write it in multiple lines using Doc strings

Feature: Email page Test

Scenario: New File for docString demo
When I reset my password on the email
Then I should recieve an email with following content
"""
Hello Ashu,
 pls click on this to reset the password
Thanks
admin team
"""

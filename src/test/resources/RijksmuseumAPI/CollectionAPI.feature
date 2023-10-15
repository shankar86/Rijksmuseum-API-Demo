#Author: Shankaragouda Patil
@shan
Feature: Rijksmuseum API's Test

  Scenario: TestCase-1 Verify HTTP 200 Response for Collection API for Rijksmuseum
    Given CollectionAPI resource url
      | RESOURCE URL | /api/nl/collection?key=0fiuZFh4&involvedMaker=Rembrandt van Rijn |
    And Request headers
      | Accept | application/json |
    When I make collection api call
    Then I verify response status code is 200
    And Verify response must have value 'elapsedMilliseconds'
    And Verify response must have value 'count'
    And Verify response must have value 'countFacets'
    And Verify response must have value 'artObjects'
    And Verify response must have value 'facets'
    And Verify responseBody must have link 'http://www.rijksmuseum.nl/api/nl/collection/SK-C-5' and objectNumber 'SK-C-5'
    And Verify responseBody must have link 'http://www.rijksmuseum.nl/api/nl/collection/SK-C-597' and objectNumber 'SK-C-597'

  Scenario: TestCase-2 Verify HTTP 401 Response for Collection API for Rijksmuseum when api-key in invalid
    Given CollectionAPI resource url
      | RESOURCE URL | /api/nl/collection?key=0fiuZFh41&involvedMaker=Rembrandt van Rijn |
    And Request headers
      | Accept | application/json |
    When I make collection api call
    Then I verify response status code is 401

  Scenario: TestCase-3 Verify HTTP 200 Response for Details of an Object API
    Given CollectionAPI resource url
      | RESOURCE URL | /api/nl/collection/SK-C-5?key=0fiuZFh4 |
    And Request headers
      | Accept | application/json |
    When I make collection api call
    Then I verify response status code is 200
    And Verify response must have value 'elapsedMilliseconds'
    And Verify response must have value 'artObject'
    And Verify response must have value 'artObjectPage'

  Scenario: TestCase-4 Verify HTTP 200 Response for Collection Image API
    Given CollectionAPI resource url
      | RESOURCE URL | api/nl/collection/SK-C-5/tiles?key=0fiuZFh4 |
    And Request headers
      | Accept | application/json |
    When I make collection api call
    Then I verify response status code is 200
    And Verify response must have value 'levels'

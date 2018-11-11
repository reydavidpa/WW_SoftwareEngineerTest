Feature: WW_SoftwareEngineerTest

  Scenario Outline: Check if file exists at certain paths
    Given a path to the file to be <filePath>
    Then Create a method called doesFileExist(String path) which takes the path of the file and tells the user if the file exists at that path or not.
    Examples:
      | filePath                          |
      | .\\src\\dictionarydoesntExist.txt |
      | .\\src\\dictionary.txt            |

  Scenario: Print out dictionary
    Given a path to the file to be .\\src\\dictionary.txt
    And Read each word and its possible meanings and print them out.

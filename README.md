This readme is included in a zip file which packages the 
  HL7 CDA Release 2 Implementation Guide:
  Emergency Medical Services Patient Care Report
  Release 3, Normative US Realm
  December 2022

## CDAR2_IG_EMSPCR_R3_2022DEC

The specification was prepared by Ockham Information Services, LLC under the guidance of the HL7 Clinical Interoperability Council Work Group.

 
## Contents of the package
 

readme.txt                            This file
CDAR2_IG_EMS_PCR_R3_2022NOV.pdf       The specification
PatientCareReportSample.xml           The sample
--.sch                                Schematron for validating instances
--.jar                                Java for validating instances

 
## Note to Readers
 
The January ballot brought the CDA IG in line with the updated (3.5) NEMSIS data set. No other changes have been made.

 
## Support files
 

MDHT model files, dita content and related files (e.g., Java classes for implementation and validation) are housed on the HL7 GitHub: https://github.com/HL7/cda-ems-patient-care-report
	
The latest CDA Schema is located on the HL7 GitHub site:
	https://github.com/HL7/cda-core-2.0/tree/master/schema/extensions 
  https://hl7.org/permalink/?CDAR2.0schema

Source materials: Project files are at https://confluence.hl7.org/display/CIC/Emergency+Medical+Services+Patient+Care+Report
Source specification: https://nemsis.org/technical-resources/version-3/version-3-data-dictionaries/
Observational terminology is also published at LOINC: (https://loinc.org/search/?t=1&s=84428-2)

### Instructions for executing Java validation:
1. Ensure Java is installed
2. Download ValidateEMS.jar from github
3. Unzip jar into a directory
4. Place test file in directory
5. Run this from the command line: java -cp "./runtime/*" org.openhealthtools.mdht.uml.cda.emspcr.util.Validate <filename>
6. Output will include warnings and informational text regarding optional constraints but should contain no errors


Please direct questions about the ballot to the HL7 CIC Working Group.


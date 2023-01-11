### Instructions for executing Java validation:
1. Ensure Java is installed
2. Download [EMSValidation](https://github.com/HL7/CDA-ems-patient-care-report/blob/main/validation/java/EMSValidation.zip)
3. Unzip 
4. Place test file in directory
5. Run this from the command line: java -cp "./runtime/*" org.openhealthtools.mdht.uml.cda.emspcr.util.Validate *filename*
6. Output will include warnings and informational text regarding optional constraints but should contain no errors

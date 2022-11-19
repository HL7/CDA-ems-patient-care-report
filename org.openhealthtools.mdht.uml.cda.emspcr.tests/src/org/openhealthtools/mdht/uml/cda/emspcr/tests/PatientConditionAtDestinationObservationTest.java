
/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;


import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientConditionAtDestinationObservationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Condition At Destination Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientConditionAtDestinationObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidatePatientConditionAtDestinationObservationTemplateId() {
			OperationsTestCase<PatientConditionAtDestinationObservation> validatePatientConditionAtDestinationObservationTemplateIdTestCase = new OperationsTestCase<PatientConditionAtDestinationObservation>(
			"validatePatientConditionAtDestinationObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAtDestinationObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationTemplateId(
					(PatientConditionAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAtDestinationObservationTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientConditionAtDestinationObservationMoodCode() {
			OperationsTestCase<PatientConditionAtDestinationObservation> validatePatientConditionAtDestinationObservationMoodCodeTestCase = new OperationsTestCase<PatientConditionAtDestinationObservation>(
			"validatePatientConditionAtDestinationObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAtDestinationObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationMoodCode(
					(PatientConditionAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAtDestinationObservationMoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientConditionAtDestinationObservationCodeP() {
			OperationsTestCase<PatientConditionAtDestinationObservation> validatePatientConditionAtDestinationObservationCodePTestCase = new OperationsTestCase<PatientConditionAtDestinationObservation>(
			"validatePatientConditionAtDestinationObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAtDestinationObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationCodeP(
					(PatientConditionAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAtDestinationObservationCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientConditionAtDestinationObservationCode() {
			OperationsTestCase<PatientConditionAtDestinationObservation> validatePatientConditionAtDestinationObservationCodeTestCase = new OperationsTestCase<PatientConditionAtDestinationObservation>(
			"validatePatientConditionAtDestinationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAtDestinationObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(PatientConditionAtDestinationObservation target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservationCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationCode(
					(PatientConditionAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAtDestinationObservationCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientConditionAtDestinationObservationValue() {
			OperationsTestCase<PatientConditionAtDestinationObservation> validatePatientConditionAtDestinationObservationValueTestCase = new OperationsTestCase<PatientConditionAtDestinationObservation>(
			"validatePatientConditionAtDestinationObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAtDestinationObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationValue(
					(PatientConditionAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAtDestinationObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientConditionAtDestinationObservationValueP() {
			OperationsTestCase<PatientConditionAtDestinationObservation> validatePatientConditionAtDestinationObservationValuePTestCase = new OperationsTestCase<PatientConditionAtDestinationObservation>(
			"validatePatientConditionAtDestinationObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAtDestinationObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientConditionAtDestinationObservationOperations.validatePatientConditionAtDestinationObservationValueP(
					(PatientConditionAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAtDestinationObservationValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends PatientConditionAtDestinationObservationOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

/**
*
* @generated
*/
	private static class ObjectFactory implements TestObjectFactory<PatientConditionAtDestinationObservation> {
		@Override
		public PatientConditionAtDestinationObservation create() {
			return EmspcrFactory.eINSTANCE.createPatientConditionAtDestinationObservation();
		}
	}


/**
*
* @generated
*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

/**
*
* @generated
*/
	private static ObjectFactory objectFactory = new ObjectFactory();


		/**
* Tests Operations Constructor for 100% coverage
* @generated
*/
	private static class ConstructorTestClass extends PatientConditionAtDestinationObservationOperations {}

		/**
* Tests Operations Constructor for 100% coverage
* @generated
*/
		@Test
	public void testConstructor() {
	        @SuppressWarnings("unused")
			ConstructorTestClass constructorTestClass = new ConstructorTestClass();		
	} // testConstructor



	/**
*
* @generated
*/
	@Override
	protected EObject getObjectToTest() {		
		return null;
	}





} // PatientConditionAtDestinationObservationOperations
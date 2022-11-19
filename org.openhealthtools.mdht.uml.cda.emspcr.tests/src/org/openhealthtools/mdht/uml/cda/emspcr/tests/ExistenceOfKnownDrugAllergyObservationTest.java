
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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfKnownDrugAllergyObservationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Known Drug Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExistenceOfKnownDrugAllergyObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownDrugAllergyObservationTemplateId() {
			OperationsTestCase<ExistenceOfKnownDrugAllergyObservation> validateExistenceOfKnownDrugAllergyObservationTemplateIdTestCase = new OperationsTestCase<ExistenceOfKnownDrugAllergyObservation>(
			"validateExistenceOfKnownDrugAllergyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownDrugAllergyObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationTemplateId(
					(ExistenceOfKnownDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownDrugAllergyObservationTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownDrugAllergyObservationMoodCode() {
			OperationsTestCase<ExistenceOfKnownDrugAllergyObservation> validateExistenceOfKnownDrugAllergyObservationMoodCodeTestCase = new OperationsTestCase<ExistenceOfKnownDrugAllergyObservation>(
			"validateExistenceOfKnownDrugAllergyObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownDrugAllergyObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationMoodCode(
					(ExistenceOfKnownDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownDrugAllergyObservationMoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownDrugAllergyObservationCodeP() {
			OperationsTestCase<ExistenceOfKnownDrugAllergyObservation> validateExistenceOfKnownDrugAllergyObservationCodePTestCase = new OperationsTestCase<ExistenceOfKnownDrugAllergyObservation>(
			"validateExistenceOfKnownDrugAllergyObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownDrugAllergyObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationCodeP(
					(ExistenceOfKnownDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownDrugAllergyObservationCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownDrugAllergyObservationCode() {
			OperationsTestCase<ExistenceOfKnownDrugAllergyObservation> validateExistenceOfKnownDrugAllergyObservationCodeTestCase = new OperationsTestCase<ExistenceOfKnownDrugAllergyObservation>(
			"validateExistenceOfKnownDrugAllergyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownDrugAllergyObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(ExistenceOfKnownDrugAllergyObservation target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservationCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationCode(
					(ExistenceOfKnownDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownDrugAllergyObservationCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownDrugAllergyObservationValue() {
			OperationsTestCase<ExistenceOfKnownDrugAllergyObservation> validateExistenceOfKnownDrugAllergyObservationValueTestCase = new OperationsTestCase<ExistenceOfKnownDrugAllergyObservation>(
			"validateExistenceOfKnownDrugAllergyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownDrugAllergyObservation target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownDrugAllergyObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationValue(
					(ExistenceOfKnownDrugAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownDrugAllergyObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ExistenceOfKnownDrugAllergyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExistenceOfKnownDrugAllergyObservation> {
		@Override
		public ExistenceOfKnownDrugAllergyObservation create() {
			return EmspcrFactory.eINSTANCE.createExistenceOfKnownDrugAllergyObservation();
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
	private static class ConstructorTestClass extends ExistenceOfKnownDrugAllergyObservationOperations {}

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





} // ExistenceOfKnownDrugAllergyObservationOperations

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
import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DrugAllergyOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy#validateDrugAllergyParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy#validateDrugAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy#validateDrugAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy#validateDrugAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy#validateDrugAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DrugAllergyTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateDrugAllergyParticipant1() {
			OperationsTestCase<DrugAllergy> validateDrugAllergyParticipant1TestCase = new OperationsTestCase<DrugAllergy>(
			"validateDrugAllergyParticipant1",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DrugAllergy target) {

			}

			@Override
			protected void updateToPass(DrugAllergy target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DrugAllergyOperations.validateDrugAllergyParticipant1(
					(DrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyParticipant1TestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDrugAllergyTemplateId() {
			OperationsTestCase<DrugAllergy> validateDrugAllergyTemplateIdTestCase = new OperationsTestCase<DrugAllergy>(
			"validateDrugAllergyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DrugAllergy target) {

			}

			@Override
			protected void updateToPass(DrugAllergy target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DrugAllergyOperations.validateDrugAllergyTemplateId(
					(DrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDrugAllergyCode() {
			OperationsTestCase<DrugAllergy> validateDrugAllergyCodeTestCase = new OperationsTestCase<DrugAllergy>(
			"validateDrugAllergyCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DrugAllergy target) {

			}

			@Override
			protected void updateToPass(DrugAllergy target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DrugAllergyOperations.validateDrugAllergyCode(
					(DrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDrugAllergyValue() {
			OperationsTestCase<DrugAllergy> validateDrugAllergyValueTestCase = new OperationsTestCase<DrugAllergy>(
			"validateDrugAllergyValue",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DrugAllergy target) {

			}

			@Override
			protected void updateToPass(DrugAllergy target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DrugAllergyOperations.validateDrugAllergyValue(
					(DrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDrugAllergyMoodCode() {
			OperationsTestCase<DrugAllergy> validateDrugAllergyMoodCodeTestCase = new OperationsTestCase<DrugAllergy>(
			"validateDrugAllergyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DrugAllergy target) {

			}

			@Override
			protected void updateToPass(DrugAllergy target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DrugAllergyOperations.validateDrugAllergyMoodCode(
					(DrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyMoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DrugAllergyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DrugAllergy> {
		@Override
		public DrugAllergy create() {
			return EmspcrFactory.eINSTANCE.createDrugAllergy();
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
	private static class ConstructorTestClass extends DrugAllergyOperations {}

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





} // DrugAllergyOperations
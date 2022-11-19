
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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfKnownNonDrugAllergyOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Known Non Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExistenceOfKnownNonDrugAllergyTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownNonDrugAllergyTemplateId() {
			OperationsTestCase<ExistenceOfKnownNonDrugAllergy> validateExistenceOfKnownNonDrugAllergyTemplateIdTestCase = new OperationsTestCase<ExistenceOfKnownNonDrugAllergy>(
			"validateExistenceOfKnownNonDrugAllergyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownNonDrugAllergy target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyTemplateId(
					(ExistenceOfKnownNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownNonDrugAllergyTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownNonDrugAllergyMoodCode() {
			OperationsTestCase<ExistenceOfKnownNonDrugAllergy> validateExistenceOfKnownNonDrugAllergyMoodCodeTestCase = new OperationsTestCase<ExistenceOfKnownNonDrugAllergy>(
			"validateExistenceOfKnownNonDrugAllergyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownNonDrugAllergy target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyMoodCode(
					(ExistenceOfKnownNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownNonDrugAllergyMoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownNonDrugAllergyCodeP() {
			OperationsTestCase<ExistenceOfKnownNonDrugAllergy> validateExistenceOfKnownNonDrugAllergyCodePTestCase = new OperationsTestCase<ExistenceOfKnownNonDrugAllergy>(
			"validateExistenceOfKnownNonDrugAllergyCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownNonDrugAllergy target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyCodeP(
					(ExistenceOfKnownNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownNonDrugAllergyCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownNonDrugAllergyCode() {
			OperationsTestCase<ExistenceOfKnownNonDrugAllergy> validateExistenceOfKnownNonDrugAllergyCodeTestCase = new OperationsTestCase<ExistenceOfKnownNonDrugAllergy>(
			"validateExistenceOfKnownNonDrugAllergyCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownNonDrugAllergy target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(ExistenceOfKnownNonDrugAllergy target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergyCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyCode(
					(ExistenceOfKnownNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownNonDrugAllergyCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateExistenceOfKnownNonDrugAllergyValue() {
			OperationsTestCase<ExistenceOfKnownNonDrugAllergy> validateExistenceOfKnownNonDrugAllergyValueTestCase = new OperationsTestCase<ExistenceOfKnownNonDrugAllergy>(
			"validateExistenceOfKnownNonDrugAllergyValue",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfKnownNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfKnownNonDrugAllergy target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyValue(
					(ExistenceOfKnownNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfKnownNonDrugAllergyValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ExistenceOfKnownNonDrugAllergyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExistenceOfKnownNonDrugAllergy> {
		@Override
		public ExistenceOfKnownNonDrugAllergy create() {
			return EmspcrFactory.eINSTANCE.createExistenceOfKnownNonDrugAllergy();
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
	private static class ConstructorTestClass extends ExistenceOfKnownNonDrugAllergyOperations {}

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





} // ExistenceOfKnownNonDrugAllergyOperations
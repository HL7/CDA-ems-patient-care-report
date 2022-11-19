
/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;


import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DrugAllergyOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Allergy Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerComponent415(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Component415</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerComponent42(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Component42</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DrugAllergyOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateDrugAllergyOrganizerTemplateId() {
			OperationsTestCase<DrugAllergyOrganizer> validateDrugAllergyOrganizerTemplateIdTestCase = new OperationsTestCase<DrugAllergyOrganizer>(
			"validateDrugAllergyOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DrugAllergyOrganizer target) {

			}

			@Override
			protected void updateToPass(DrugAllergyOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DrugAllergyOrganizerOperations.validateDrugAllergyOrganizerTemplateId(
					(DrugAllergyOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyOrganizerTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDrugAllergyOrganizerComponent415() {
			OperationsTestCase<DrugAllergyOrganizer> validateDrugAllergyOrganizerComponent415TestCase = new OperationsTestCase<DrugAllergyOrganizer>(
			"validateDrugAllergyOrganizerComponent415",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT415__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DrugAllergyOrganizer target) {

			}

			@Override
			protected void updateToPass(DrugAllergyOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DrugAllergyOrganizerOperations.validateDrugAllergyOrganizerComponent415(
					(DrugAllergyOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyOrganizerComponent415TestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDrugAllergyOrganizerComponent42() {
			OperationsTestCase<DrugAllergyOrganizer> validateDrugAllergyOrganizerComponent42TestCase = new OperationsTestCase<DrugAllergyOrganizer>(
			"validateDrugAllergyOrganizerComponent42",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DrugAllergyOrganizer target) {

			}

			@Override
			protected void updateToPass(DrugAllergyOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DrugAllergyOrganizerOperations.validateDrugAllergyOrganizerComponent42(
					(DrugAllergyOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyOrganizerComponent42TestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DrugAllergyOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DrugAllergyOrganizer> {
		@Override
		public DrugAllergyOrganizer create() {
			return EmspcrFactory.eINSTANCE.createDrugAllergyOrganizer();
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
	private static class ConstructorTestClass extends DrugAllergyOrganizerOperations {}

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





} // DrugAllergyOrganizerOperations
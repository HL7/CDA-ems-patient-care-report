/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSCurrentMedicationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Current Medication Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionCurrentlyOnMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Currently On Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#getCurrentlyOnMedication() <em>Get Currently On Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#getCurrentMedications() <em>Get Current Medications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSCurrentMedicationSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionTemplateId() {
			OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionTemplateIdTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
			"validateEMSCurrentMedicationSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(EMSCurrentMedicationSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionTemplateId(
					(EMSCurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCurrentMedicationSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionCode() {
			OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionCodeTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
			"validateEMSCurrentMedicationSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(EMSCurrentMedicationSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCode(
					(EMSCurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCurrentMedicationSectionCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateEMSCurrentMedicationSectionCodeP() {
			OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionCodePTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
			"validateEMSCurrentMedicationSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(EMSCurrentMedicationSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCodeP(
					(EMSCurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCurrentMedicationSectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionTitle() {
			OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionTitleTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
			"validateEMSCurrentMedicationSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(EMSCurrentMedicationSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionTitle(
					(EMSCurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCurrentMedicationSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionText() {
			OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionTextTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
			"validateEMSCurrentMedicationSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(EMSCurrentMedicationSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionText(
					(EMSCurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCurrentMedicationSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionCurrentlyOnMedication() {
			OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionCurrentlyOnMedicationTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
			"validateEMSCurrentMedicationSectionCurrentlyOnMedication",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(EMSCurrentMedicationSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCurrentlyOnMedication(
					(EMSCurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCurrentMedicationSectionCurrentlyOnMedicationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionCurrentMedication() {
			OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionCurrentMedicationTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
			"validateEMSCurrentMedicationSectionCurrentMedication",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(EMSCurrentMedicationSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCurrentMedication(
					(EMSCurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCurrentMedicationSectionCurrentMedicationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCurrentlyOnMedication() {


EMSCurrentMedicationSection target = objectFactory.create();
target.getCurrentlyOnMedication();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCurrentMedications() {


EMSCurrentMedicationSection target = objectFactory.create();
target.getCurrentMedications();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSCurrentMedicationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSCurrentMedicationSection> {
		@Override
		public EMSCurrentMedicationSection create() {
			return EmspcrFactory.eINSTANCE.createEMSCurrentMedicationSection();
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
	private static class ConstructorTestClass extends EMSCurrentMedicationSectionOperations {
	}

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

} // EMSCurrentMedicationSectionOperations

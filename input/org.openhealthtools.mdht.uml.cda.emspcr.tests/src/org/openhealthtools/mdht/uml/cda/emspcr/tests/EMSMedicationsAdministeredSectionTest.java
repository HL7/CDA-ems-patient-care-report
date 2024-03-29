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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSMedicationsAdministeredSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Medications Administered Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionMedicationAdministered(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Medication Administered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#getMedicationAdministereds() <em>Get Medication Administereds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSMedicationsAdministeredSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSMedicationsAdministeredSectionTemplateId() {
			OperationsTestCase<EMSMedicationsAdministeredSection> validateEMSMedicationsAdministeredSectionTemplateIdTestCase = new OperationsTestCase<EMSMedicationsAdministeredSection>(
			"validateEMSMedicationsAdministeredSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSMedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(EMSMedicationsAdministeredSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionTemplateId(
					(EMSMedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSMedicationsAdministeredSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSMedicationsAdministeredSectionCode() {
			OperationsTestCase<EMSMedicationsAdministeredSection> validateEMSMedicationsAdministeredSectionCodeTestCase = new OperationsTestCase<EMSMedicationsAdministeredSection>(
			"validateEMSMedicationsAdministeredSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSMedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(EMSMedicationsAdministeredSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionCode(
					(EMSMedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSMedicationsAdministeredSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSMedicationsAdministeredSectionCodeP() {
			OperationsTestCase<EMSMedicationsAdministeredSection> validateEMSMedicationsAdministeredSectionCodePTestCase = new OperationsTestCase<EMSMedicationsAdministeredSection>(
			"validateEMSMedicationsAdministeredSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSMedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(EMSMedicationsAdministeredSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionCodeP(
					(EMSMedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSMedicationsAdministeredSectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSMedicationsAdministeredSectionTitle() {
			OperationsTestCase<EMSMedicationsAdministeredSection> validateEMSMedicationsAdministeredSectionTitleTestCase = new OperationsTestCase<EMSMedicationsAdministeredSection>(
			"validateEMSMedicationsAdministeredSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSMedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(EMSMedicationsAdministeredSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionTitle(
					(EMSMedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSMedicationsAdministeredSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSMedicationsAdministeredSectionText() {
			OperationsTestCase<EMSMedicationsAdministeredSection> validateEMSMedicationsAdministeredSectionTextTestCase = new OperationsTestCase<EMSMedicationsAdministeredSection>(
			"validateEMSMedicationsAdministeredSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSMedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(EMSMedicationsAdministeredSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionText(
					(EMSMedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSMedicationsAdministeredSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSMedicationsAdministeredSectionMedicationAdministered() {
			OperationsTestCase<EMSMedicationsAdministeredSection> validateEMSMedicationsAdministeredSectionMedicationAdministeredTestCase = new OperationsTestCase<EMSMedicationsAdministeredSection>(
			"validateEMSMedicationsAdministeredSectionMedicationAdministered",
			operationsForOCL.getOCLValue("VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSMedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(EMSMedicationsAdministeredSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionMedicationAdministered(
					(EMSMedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSMedicationsAdministeredSectionMedicationAdministeredTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationAdministereds() {


EMSMedicationsAdministeredSection target = objectFactory.create();
target.getMedicationAdministereds();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSMedicationsAdministeredSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSMedicationsAdministeredSection> {
		@Override
		public EMSMedicationsAdministeredSection create() {
			return EmspcrFactory.eINSTANCE.createEMSMedicationsAdministeredSection();
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
	private static class ConstructorTestClass extends EMSMedicationsAdministeredSectionOperations {
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

} // EMSMedicationsAdministeredSectionOperations

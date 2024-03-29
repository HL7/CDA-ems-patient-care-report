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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPatientCareNarrativeSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Patient Care Narrative Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSPatientCareNarrativeSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPatientCareNarrativeSectionTemplateId() {
			OperationsTestCase<EMSPatientCareNarrativeSection> validateEMSPatientCareNarrativeSectionTemplateIdTestCase = new OperationsTestCase<EMSPatientCareNarrativeSection>(
			"validateEMSPatientCareNarrativeSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(EMSPatientCareNarrativeSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionTemplateId(
					(EMSPatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPatientCareNarrativeSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPatientCareNarrativeSectionCode() {
			OperationsTestCase<EMSPatientCareNarrativeSection> validateEMSPatientCareNarrativeSectionCodeTestCase = new OperationsTestCase<EMSPatientCareNarrativeSection>(
			"validateEMSPatientCareNarrativeSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(EMSPatientCareNarrativeSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionCode(
					(EMSPatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPatientCareNarrativeSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPatientCareNarrativeSectionCodeP() {
			OperationsTestCase<EMSPatientCareNarrativeSection> validateEMSPatientCareNarrativeSectionCodePTestCase = new OperationsTestCase<EMSPatientCareNarrativeSection>(
			"validateEMSPatientCareNarrativeSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(EMSPatientCareNarrativeSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionCodeP(
					(EMSPatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPatientCareNarrativeSectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPatientCareNarrativeSectionTitle() {
			OperationsTestCase<EMSPatientCareNarrativeSection> validateEMSPatientCareNarrativeSectionTitleTestCase = new OperationsTestCase<EMSPatientCareNarrativeSection>(
			"validateEMSPatientCareNarrativeSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(EMSPatientCareNarrativeSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionTitle(
					(EMSPatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPatientCareNarrativeSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPatientCareNarrativeSectionText() {
			OperationsTestCase<EMSPatientCareNarrativeSection> validateEMSPatientCareNarrativeSectionTextTestCase = new OperationsTestCase<EMSPatientCareNarrativeSection>(
			"validateEMSPatientCareNarrativeSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPatientCareNarrativeSection target) {

			}

			@Override
			protected void updateToPass(EMSPatientCareNarrativeSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionText(
					(EMSPatientCareNarrativeSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPatientCareNarrativeSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSPatientCareNarrativeSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSPatientCareNarrativeSection> {
		@Override
		public EMSPatientCareNarrativeSection create() {
			return EmspcrFactory.eINSTANCE.createEMSPatientCareNarrativeSection();
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
	private static class ConstructorTestClass extends EMSPatientCareNarrativeSectionOperations {
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

} // EMSPatientCareNarrativeSectionOperations

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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPastMedicalHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Past Medical History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Existence Of History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionHistoryOfCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#getExistenceOfHistoryOfCondition() <em>Get Existence Of History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#getHistoryOfCondition() <em>Get History Of Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSPastMedicalHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionTemplateId() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionTemplateIdTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionTemplateId(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionCode() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionCodeTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionCode(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionCodeP() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionCodePTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionCodeP(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionTitle() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionTitleTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionTitle(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionText() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionTextTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionText(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionExistenceOfHistoryOfConditionTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionExistenceOfHistoryOfConditionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionHistoryOfCondition() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionHistoryOfConditionTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionHistoryOfCondition",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionHistoryOfCondition(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionHistoryOfConditionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExistenceOfHistoryOfCondition() {


EMSPastMedicalHistorySection target = objectFactory.create();
target.getExistenceOfHistoryOfCondition();



}

	/**
*
* @generated
*/
@Test



public void testGetHistoryOfCondition() {


EMSPastMedicalHistorySection target = objectFactory.create();
target.getHistoryOfCondition();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSPastMedicalHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSPastMedicalHistorySection> {
		@Override
		public EMSPastMedicalHistorySection create() {
			return EmspcrFactory.eINSTANCE.createEMSPastMedicalHistorySection();
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
	private static class ConstructorTestClass extends EMSPastMedicalHistorySectionOperations {
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

} // EMSPastMedicalHistorySectionOperations

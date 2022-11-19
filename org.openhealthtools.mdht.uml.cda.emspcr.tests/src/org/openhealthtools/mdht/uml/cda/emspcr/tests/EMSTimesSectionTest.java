
/**
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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSTimesSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Times Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionCallTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Call Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitNotifiedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitEnRouteTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit En Route Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitOnSceneTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit On Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitAtPatienttTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit At Patientt Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitLeftSceneTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Left Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionPatientArrivedAtDestinationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Patient Arrived At Destination Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitBackInServiceTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Back In Service Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionDispatchNotifiedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Dispatch Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getCallTime() <em>Get Call Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitNotifiedTime() <em>Get Unit Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitEnRouteTime() <em>Get Unit En Route Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitOnSceneTime() <em>Get Unit On Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitAtPatienttTime() <em>Get Unit At Patientt Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitLeftSceneTime() <em>Get Unit Left Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getPatientArrivedAtDestinationTime() <em>Get Patient Arrived At Destination Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitBackInServiceTime() <em>Get Unit Back In Service Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getDispatchNotifiedTime() <em>Get Dispatch Notified Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSTimesSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionTemplateId() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionTemplateIdTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionTemplateId(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionCode() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionCodeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionCode(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionCodeP() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionCodePTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionCodeP(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionTitle() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionTitleTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionTitle(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionTitleTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionText() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionTextTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionText(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionTextTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionCallTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionCallTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionCallTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionCallTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionCallTimeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionUnitNotifiedTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionUnitNotifiedTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionUnitNotifiedTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionUnitNotifiedTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionUnitNotifiedTimeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionUnitEnRouteTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionUnitEnRouteTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionUnitEnRouteTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionUnitEnRouteTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionUnitEnRouteTimeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionUnitOnSceneTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionUnitOnSceneTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionUnitOnSceneTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionUnitOnSceneTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionUnitOnSceneTimeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionUnitAtPatienttTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionUnitAtPatienttTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionUnitAtPatienttTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionUnitAtPatienttTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionUnitAtPatienttTimeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionUnitLeftSceneTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionUnitLeftSceneTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionUnitLeftSceneTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionUnitLeftSceneTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionUnitLeftSceneTimeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionPatientArrivedAtDestinationTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionPatientArrivedAtDestinationTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionPatientArrivedAtDestinationTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionPatientArrivedAtDestinationTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionPatientArrivedAtDestinationTimeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionUnitBackInServiceTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionUnitBackInServiceTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionUnitBackInServiceTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionUnitBackInServiceTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionUnitBackInServiceTimeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateEMSTimesSectionDispatchNotifiedTime() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionDispatchNotifiedTimeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionDispatchNotifiedTime",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionDispatchNotifiedTime(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionDispatchNotifiedTimeTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test



public void testGetCallTime() {


EMSTimesSection target = objectFactory.create();
target.getCallTime();



}






/**
*
* @generated
*/
@Test



public void testGetUnitNotifiedTime() {


EMSTimesSection target = objectFactory.create();
target.getUnitNotifiedTime();



}






/**
*
* @generated
*/
@Test



public void testGetUnitEnRouteTime() {


EMSTimesSection target = objectFactory.create();
target.getUnitEnRouteTime();



}






/**
*
* @generated
*/
@Test



public void testGetUnitOnSceneTime() {


EMSTimesSection target = objectFactory.create();
target.getUnitOnSceneTime();



}






/**
*
* @generated
*/
@Test



public void testGetUnitAtPatienttTime() {


EMSTimesSection target = objectFactory.create();
target.getUnitAtPatienttTime();



}






/**
*
* @generated
*/
@Test



public void testGetUnitLeftSceneTime() {


EMSTimesSection target = objectFactory.create();
target.getUnitLeftSceneTime();



}






/**
*
* @generated
*/
@Test



public void testGetPatientArrivedAtDestinationTime() {


EMSTimesSection target = objectFactory.create();
target.getPatientArrivedAtDestinationTime();



}






/**
*
* @generated
*/
@Test



public void testGetUnitBackInServiceTime() {


EMSTimesSection target = objectFactory.create();
target.getUnitBackInServiceTime();



}






/**
*
* @generated
*/
@Test



public void testGetDispatchNotifiedTime() {


EMSTimesSection target = objectFactory.create();
target.getDispatchNotifiedTime();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends EMSTimesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSTimesSection> {
		@Override
		public EMSTimesSection create() {
			return EmspcrFactory.eINSTANCE.createEMSTimesSection();
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
	private static class ConstructorTestClass extends EMSTimesSectionOperations {}

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





} // EMSTimesSectionOperations
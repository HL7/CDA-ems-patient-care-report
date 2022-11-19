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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientLocationInVehicleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Location In Vehicle</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientLocationInVehicleTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientLocationInVehicleTemplateId() {
			OperationsTestCase<PatientLocationInVehicle> validatePatientLocationInVehicleTemplateIdTestCase = new OperationsTestCase<PatientLocationInVehicle>(
			"validatePatientLocationInVehicleTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientLocationInVehicle target) {

			}

			@Override
			protected void updateToPass(PatientLocationInVehicle target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientLocationInVehicleOperations.validatePatientLocationInVehicleTemplateId(
					(PatientLocationInVehicle) objectToTest, diagnostician, map);
			}

		};

		validatePatientLocationInVehicleTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientLocationInVehicleMoodCode() {
			OperationsTestCase<PatientLocationInVehicle> validatePatientLocationInVehicleMoodCodeTestCase = new OperationsTestCase<PatientLocationInVehicle>(
			"validatePatientLocationInVehicleMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientLocationInVehicle target) {

			}

			@Override
			protected void updateToPass(PatientLocationInVehicle target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientLocationInVehicleOperations.validatePatientLocationInVehicleMoodCode(
					(PatientLocationInVehicle) objectToTest, diagnostician, map);
			}

		};

		validatePatientLocationInVehicleMoodCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidatePatientLocationInVehicleCodeP() {
			OperationsTestCase<PatientLocationInVehicle> validatePatientLocationInVehicleCodePTestCase = new OperationsTestCase<PatientLocationInVehicle>(
			"validatePatientLocationInVehicleCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientLocationInVehicle target) {

			}

			@Override
			protected void updateToPass(PatientLocationInVehicle target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientLocationInVehicleOperations.validatePatientLocationInVehicleCodeP(
					(PatientLocationInVehicle) objectToTest, diagnostician, map);
			}

		};

		validatePatientLocationInVehicleCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientLocationInVehicleCode() {
			OperationsTestCase<PatientLocationInVehicle> validatePatientLocationInVehicleCodeTestCase = new OperationsTestCase<PatientLocationInVehicle>(
			"validatePatientLocationInVehicleCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientLocationInVehicle target) {

			}

			@Override
			protected void updateToPass(PatientLocationInVehicle target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(PatientLocationInVehicle target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicleCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientLocationInVehicleOperations.validatePatientLocationInVehicleCode(
					(PatientLocationInVehicle) objectToTest, diagnostician, map);
			}

		};

		validatePatientLocationInVehicleCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientLocationInVehicleValue() {
			OperationsTestCase<PatientLocationInVehicle> validatePatientLocationInVehicleValueTestCase = new OperationsTestCase<PatientLocationInVehicle>(
			"validatePatientLocationInVehicleValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientLocationInVehicle target) {

			}

			@Override
			protected void updateToPass(PatientLocationInVehicle target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientLocationInVehicleOperations.validatePatientLocationInVehicleValue(
					(PatientLocationInVehicle) objectToTest, diagnostician, map);
			}

		};

		validatePatientLocationInVehicleValueTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidatePatientLocationInVehicleValueP() {
			OperationsTestCase<PatientLocationInVehicle> validatePatientLocationInVehicleValuePTestCase = new OperationsTestCase<PatientLocationInVehicle>(
			"validatePatientLocationInVehicleValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientLocationInVehicle target) {

			}

			@Override
			protected void updateToPass(PatientLocationInVehicle target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientLocationInVehicleOperations.validatePatientLocationInVehicleValueP(
					(PatientLocationInVehicle) objectToTest, diagnostician, map);
			}

		};

		validatePatientLocationInVehicleValuePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientLocationInVehicleOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientLocationInVehicle> {
		@Override
		public PatientLocationInVehicle create() {
			return EmspcrFactory.eINSTANCE.createPatientLocationInVehicle();
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
	private static class ConstructorTestClass extends PatientLocationInVehicleOperations {
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

} // PatientLocationInVehicleOperations

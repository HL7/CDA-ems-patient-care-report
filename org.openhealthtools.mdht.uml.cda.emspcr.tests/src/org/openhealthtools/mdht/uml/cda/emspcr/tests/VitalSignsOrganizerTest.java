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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.VitalSignsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerSystolicBloodPressureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Systolic Blood Pressure Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerRespiratoryRateComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Respiratory Rate Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerBodyTemperatureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Body Temperature Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerOxygenSaturationComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Oxygen Saturation Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerComponent411(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Component411</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerComponent42(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Component42</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer#validateVitalSignsOrganizerComponent43(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Component43</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsOrganizerTest extends CDAValidationTest {

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerSystolicBloodPressureComponent() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerSystolicBloodPressureComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerSystolicBloodPressureComponent",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_SYSTOLIC_BLOOD_PRESSURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerSystolicBloodPressureComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerSystolicBloodPressureComponentTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerRespiratoryRateComponent() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerRespiratoryRateComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerRespiratoryRateComponent",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_RESPIRATORY_RATE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerRespiratoryRateComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerRespiratoryRateComponentTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerBodyTemperatureComponent() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerBodyTemperatureComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerBodyTemperatureComponent",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_BODY_TEMPERATURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerBodyTemperatureComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerBodyTemperatureComponentTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerOxygenSaturationComponent() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerOxygenSaturationComponentTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerOxygenSaturationComponent",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_OXYGEN_SATURATION_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerOxygenSaturationComponent(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerOxygenSaturationComponentTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsOrganizerTemplateId() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerTemplateIdTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerTemplateId(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerTemplateIdTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerCode() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerCodeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerCode(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerCodeP() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerCodePTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerCodeP",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerCodeP(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerCodePTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerEffectiveTime() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerEffectiveTimeTestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerEffectiveTime(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerEffectiveTimeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerComponent411() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerComponent411TestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerComponent411",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_COMPONENT411__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerComponent411(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerComponent411TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerComponent42() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerComponent42TestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerComponent42",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerComponent42(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerComponent42TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateVitalSignsOrganizerComponent43() {
			OperationsTestCase<VitalSignsOrganizer> validateVitalSignsOrganizerComponent43TestCase = new OperationsTestCase<VitalSignsOrganizer>(
			"validateVitalSignsOrganizerComponent43",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(VitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignsOrganizerOperations.validateVitalSignsOrganizerComponent43(
					(VitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsOrganizerComponent43TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsOrganizer> {
		@Override
		public VitalSignsOrganizer create() {
			return EmspcrFactory.eINSTANCE.createVitalSignsOrganizer();
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
	private static class ConstructorTestClass extends VitalSignsOrganizerOperations {
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

} // VitalSignsOrganizerOperations

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
import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.AdditionalVitalSignsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Additional Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent416(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component416</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent42(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component42</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent43(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component43</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent44(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component44</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent45(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component45</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent46(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component46</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent47(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component47</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent48(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component48</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdditionalVitalSignsOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerTemplateId() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerTemplateIdTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerTemplateId(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerMoodCode() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerMoodCodeTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerMoodCode(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerEffectiveTime() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerEffectiveTimeTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerEffectiveTime(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerEffectiveTimeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateAdditionalVitalSignsOrganizerComponent416() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerComponent416TestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerComponent416",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT416__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent416(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerComponent416TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateAdditionalVitalSignsOrganizerComponent42() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerComponent42TestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerComponent42",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent42(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerComponent42TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateAdditionalVitalSignsOrganizerComponent43() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerComponent43TestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerComponent43",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent43(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerComponent43TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateAdditionalVitalSignsOrganizerComponent44() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerComponent44TestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerComponent44",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT44__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent44(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerComponent44TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateAdditionalVitalSignsOrganizerComponent45() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerComponent45TestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerComponent45",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT45__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent45(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerComponent45TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateAdditionalVitalSignsOrganizerComponent46() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerComponent46TestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerComponent46",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT46__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent46(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerComponent46TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateAdditionalVitalSignsOrganizerComponent47() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerComponent47TestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerComponent47",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT47__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent47(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerComponent47TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateAdditionalVitalSignsOrganizerComponent48() {
			OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerComponent48TestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerComponent48",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT48__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerComponent48(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerComponent48TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdditionalVitalSignsOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdditionalVitalSignsOrganizer> {
		@Override
		public AdditionalVitalSignsOrganizer create() {
			return EmspcrFactory.eINSTANCE.createAdditionalVitalSignsOrganizer();
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
	private static class ConstructorTestClass extends AdditionalVitalSignsOrganizerOperations {
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

} // AdditionalVitalSignsOrganizerOperations

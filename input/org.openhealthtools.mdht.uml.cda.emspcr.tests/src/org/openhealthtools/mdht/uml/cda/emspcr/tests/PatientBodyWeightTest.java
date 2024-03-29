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
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientBodyWeightOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Body Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight#validatePatientBodyWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Body Weight Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientBodyWeightTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientBodyWeightTemplateId() {
			OperationsTestCase<PatientBodyWeight> validatePatientBodyWeightTemplateIdTestCase = new OperationsTestCase<PatientBodyWeight>(
			"validatePatientBodyWeightTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientBodyWeight target) {

			}

			@Override
			protected void updateToPass(PatientBodyWeight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientBodyWeightOperations.validatePatientBodyWeightTemplateId(
					(PatientBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePatientBodyWeightTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientBodyWeightMoodCode() {
			OperationsTestCase<PatientBodyWeight> validatePatientBodyWeightMoodCodeTestCase = new OperationsTestCase<PatientBodyWeight>(
			"validatePatientBodyWeightMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientBodyWeight target) {

			}

			@Override
			protected void updateToPass(PatientBodyWeight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientBodyWeightOperations.validatePatientBodyWeightMoodCode(
					(PatientBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePatientBodyWeightMoodCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidatePatientBodyWeightCodeP() {
			OperationsTestCase<PatientBodyWeight> validatePatientBodyWeightCodePTestCase = new OperationsTestCase<PatientBodyWeight>(
			"validatePatientBodyWeightCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BODY_WEIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientBodyWeight target) {

			}

			@Override
			protected void updateToPass(PatientBodyWeight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientBodyWeightOperations.validatePatientBodyWeightCodeP(
					(PatientBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePatientBodyWeightCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientBodyWeightCode() {
			OperationsTestCase<PatientBodyWeight> validatePatientBodyWeightCodeTestCase = new OperationsTestCase<PatientBodyWeight>(
			"validatePatientBodyWeightCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientBodyWeight target) {

			}

			@Override
			protected void updateToPass(PatientBodyWeight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(PatientBodyWeight target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeightCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientBodyWeightOperations.validatePatientBodyWeightCode(
					(PatientBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePatientBodyWeightCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidatePatientBodyWeightEffectiveTime() {
			OperationsTestCase<PatientBodyWeight> validatePatientBodyWeightEffectiveTimeTestCase = new OperationsTestCase<PatientBodyWeight>(
			"validatePatientBodyWeightEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BODY_WEIGHT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientBodyWeight target) {

			}

			@Override
			protected void updateToPass(PatientBodyWeight target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientBodyWeightOperations.validatePatientBodyWeightEffectiveTime(
					(PatientBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePatientBodyWeightEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientBodyWeightValue() {
			OperationsTestCase<PatientBodyWeight> validatePatientBodyWeightValueTestCase = new OperationsTestCase<PatientBodyWeight>(
			"validatePatientBodyWeightValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientBodyWeight target) {

			}

			@Override
			protected void updateToPass(PatientBodyWeight target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientBodyWeightOperations.validatePatientBodyWeightValue(
					(PatientBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePatientBodyWeightValueTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientBodyWeightOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientBodyWeight> {
		@Override
		public PatientBodyWeight create() {
			return EmspcrFactory.eINSTANCE.createPatientBodyWeight();
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
	private static class ConstructorTestClass extends PatientBodyWeightOperations {
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

} // PatientBodyWeightOperations

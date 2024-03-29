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
import org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.SystolicBloodPressureOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Systolic Blood Pressure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Method Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SystolicBloodPressureTest extends CDAValidationTest {

	/**
*
* @generated
*/
@Test



public void testValidateSystolicBloodPressureTemplateId() {
			OperationsTestCase<SystolicBloodPressure> validateSystolicBloodPressureTemplateIdTestCase = new OperationsTestCase<SystolicBloodPressure>(
			"validateSystolicBloodPressureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SYSTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SystolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(SystolicBloodPressure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SystolicBloodPressureOperations.validateSystolicBloodPressureTemplateId(
					(SystolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateSystolicBloodPressureTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSystolicBloodPressureMoodCode() {
			OperationsTestCase<SystolicBloodPressure> validateSystolicBloodPressureMoodCodeTestCase = new OperationsTestCase<SystolicBloodPressure>(
			"validateSystolicBloodPressureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SYSTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SystolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(SystolicBloodPressure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SystolicBloodPressureOperations.validateSystolicBloodPressureMoodCode(
					(SystolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateSystolicBloodPressureMoodCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateSystolicBloodPressureCodeP() {
			OperationsTestCase<SystolicBloodPressure> validateSystolicBloodPressureCodePTestCase = new OperationsTestCase<SystolicBloodPressure>(
			"validateSystolicBloodPressureCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SystolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(SystolicBloodPressure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SystolicBloodPressureOperations.validateSystolicBloodPressureCodeP(
					(SystolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateSystolicBloodPressureCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSystolicBloodPressureCode() {
			OperationsTestCase<SystolicBloodPressure> validateSystolicBloodPressureCodeTestCase = new OperationsTestCase<SystolicBloodPressure>(
			"validateSystolicBloodPressureCode",
			operationsForOCL.getOCLValue("VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SystolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(SystolicBloodPressure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(SystolicBloodPressure target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressureCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SystolicBloodPressureOperations.validateSystolicBloodPressureCode(
					(SystolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateSystolicBloodPressureCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateSystolicBloodPressureEffectiveTime() {
			OperationsTestCase<SystolicBloodPressure> validateSystolicBloodPressureEffectiveTimeTestCase = new OperationsTestCase<SystolicBloodPressure>(
			"validateSystolicBloodPressureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SYSTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SystolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(SystolicBloodPressure target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SystolicBloodPressureOperations.validateSystolicBloodPressureEffectiveTime(
					(SystolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateSystolicBloodPressureEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSystolicBloodPressureValue() {
			OperationsTestCase<SystolicBloodPressure> validateSystolicBloodPressureValueTestCase = new OperationsTestCase<SystolicBloodPressure>(
			"validateSystolicBloodPressureValue",
			operationsForOCL.getOCLValue("VALIDATE_SYSTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SystolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(SystolicBloodPressure target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SystolicBloodPressureOperations.validateSystolicBloodPressureValue(
					(SystolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateSystolicBloodPressureValueTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateSystolicBloodPressureMethodCode() {
			OperationsTestCase<SystolicBloodPressure> validateSystolicBloodPressureMethodCodeTestCase = new OperationsTestCase<SystolicBloodPressure>(
			"validateSystolicBloodPressureMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SystolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(SystolicBloodPressure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SystolicBloodPressureOperations.validateSystolicBloodPressureMethodCode(
					(SystolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateSystolicBloodPressureMethodCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateSystolicBloodPressureMethodCodeP() {
			OperationsTestCase<SystolicBloodPressure> validateSystolicBloodPressureMethodCodePTestCase = new OperationsTestCase<SystolicBloodPressure>(
			"validateSystolicBloodPressureMethodCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SystolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(SystolicBloodPressure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SystolicBloodPressureOperations.validateSystolicBloodPressureMethodCodeP(
					(SystolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateSystolicBloodPressureMethodCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SystolicBloodPressureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SystolicBloodPressure> {
		@Override
		public SystolicBloodPressure create() {
			return EmspcrFactory.eINSTANCE.createSystolicBloodPressure();
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
	private static class ConstructorTestClass extends SystolicBloodPressureOperations {
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

} // SystolicBloodPressureOperations

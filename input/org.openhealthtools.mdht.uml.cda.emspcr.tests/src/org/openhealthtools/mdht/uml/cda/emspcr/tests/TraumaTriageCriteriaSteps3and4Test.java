
/**
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
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.TraumaTriageCriteriaSteps3and4Operations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Trauma Triage Criteria Steps3and4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TraumaTriageCriteriaSteps3and4Test extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps3and4TemplateId() {
			OperationsTestCase<TraumaTriageCriteriaSteps3and4> validateTraumaTriageCriteriaSteps3and4TemplateIdTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps3and4>(
			"validateTraumaTriageCriteriaSteps3and4TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps3and4 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps3and4 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4TemplateId(
					(TraumaTriageCriteriaSteps3and4) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps3and4TemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps3and4MoodCode() {
			OperationsTestCase<TraumaTriageCriteriaSteps3and4> validateTraumaTriageCriteriaSteps3and4MoodCodeTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps3and4>(
			"validateTraumaTriageCriteriaSteps3and4MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps3and4 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps3and4 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4MoodCode(
					(TraumaTriageCriteriaSteps3and4) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps3and4MoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps3and4CodeP() {
			OperationsTestCase<TraumaTriageCriteriaSteps3and4> validateTraumaTriageCriteriaSteps3and4CodePTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps3and4>(
			"validateTraumaTriageCriteriaSteps3and4CodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps3and4 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps3and4 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4CodeP(
					(TraumaTriageCriteriaSteps3and4) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps3and4CodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps3and4Code() {
			OperationsTestCase<TraumaTriageCriteriaSteps3and4> validateTraumaTriageCriteriaSteps3and4CodeTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps3and4>(
			"validateTraumaTriageCriteriaSteps3and4Code",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps3and4 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps3and4 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(TraumaTriageCriteriaSteps3and4 target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4CodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4Code(
					(TraumaTriageCriteriaSteps3and4) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps3and4CodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps3and4Value() {
			OperationsTestCase<TraumaTriageCriteriaSteps3and4> validateTraumaTriageCriteriaSteps3and4ValueTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps3and4>(
			"validateTraumaTriageCriteriaSteps3and4Value",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps3and4 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps3and4 target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4Value(
					(TraumaTriageCriteriaSteps3and4) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps3and4ValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps3and4ValueP() {
			OperationsTestCase<TraumaTriageCriteriaSteps3and4> validateTraumaTriageCriteriaSteps3and4ValuePTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps3and4>(
			"validateTraumaTriageCriteriaSteps3and4ValueP",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps3and4 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps3and4 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps3and4Operations.validateTraumaTriageCriteriaSteps3and4ValueP(
					(TraumaTriageCriteriaSteps3and4) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps3and4ValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends TraumaTriageCriteriaSteps3and4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<TraumaTriageCriteriaSteps3and4> {
		@Override
		public TraumaTriageCriteriaSteps3and4 create() {
			return EmspcrFactory.eINSTANCE.createTraumaTriageCriteriaSteps3and4();
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
	private static class ConstructorTestClass extends TraumaTriageCriteriaSteps3and4Operations {}

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





} // TraumaTriageCriteriaSteps3and4Operations
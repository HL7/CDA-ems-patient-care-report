
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
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.TraumaTriageCriteriaSteps1and2Operations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Trauma Triage Criteria Steps1and2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TraumaTriageCriteriaSteps1and2Test extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps1and2TemplateId() {
			OperationsTestCase<TraumaTriageCriteriaSteps1and2> validateTraumaTriageCriteriaSteps1and2TemplateIdTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps1and2>(
			"validateTraumaTriageCriteriaSteps1and2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps1and2 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps1and2 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2TemplateId(
					(TraumaTriageCriteriaSteps1and2) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps1and2TemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps1and2MoodCode() {
			OperationsTestCase<TraumaTriageCriteriaSteps1and2> validateTraumaTriageCriteriaSteps1and2MoodCodeTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps1and2>(
			"validateTraumaTriageCriteriaSteps1and2MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps1and2 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps1and2 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2MoodCode(
					(TraumaTriageCriteriaSteps1and2) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps1and2MoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps1and2CodeP() {
			OperationsTestCase<TraumaTriageCriteriaSteps1and2> validateTraumaTriageCriteriaSteps1and2CodePTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps1and2>(
			"validateTraumaTriageCriteriaSteps1and2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps1and2 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps1and2 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2CodeP(
					(TraumaTriageCriteriaSteps1and2) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps1and2CodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps1and2Code() {
			OperationsTestCase<TraumaTriageCriteriaSteps1and2> validateTraumaTriageCriteriaSteps1and2CodeTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps1and2>(
			"validateTraumaTriageCriteriaSteps1and2Code",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps1and2 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps1and2 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(TraumaTriageCriteriaSteps1and2 target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2CodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2Code(
					(TraumaTriageCriteriaSteps1and2) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps1and2CodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps1and2Value() {
			OperationsTestCase<TraumaTriageCriteriaSteps1and2> validateTraumaTriageCriteriaSteps1and2ValueTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps1and2>(
			"validateTraumaTriageCriteriaSteps1and2Value",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps1and2 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps1and2 target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2Value(
					(TraumaTriageCriteriaSteps1and2) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps1and2ValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTraumaTriageCriteriaSteps1and2ValueP() {
			OperationsTestCase<TraumaTriageCriteriaSteps1and2> validateTraumaTriageCriteriaSteps1and2ValuePTestCase = new OperationsTestCase<TraumaTriageCriteriaSteps1and2>(
			"validateTraumaTriageCriteriaSteps1and2ValueP",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TraumaTriageCriteriaSteps1and2 target) {

			}

			@Override
			protected void updateToPass(TraumaTriageCriteriaSteps1and2 target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TraumaTriageCriteriaSteps1and2Operations.validateTraumaTriageCriteriaSteps1and2ValueP(
					(TraumaTriageCriteriaSteps1and2) objectToTest, diagnostician, map);
			}

		};

		validateTraumaTriageCriteriaSteps1and2ValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends TraumaTriageCriteriaSteps1and2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<TraumaTriageCriteriaSteps1and2> {
		@Override
		public TraumaTriageCriteriaSteps1and2 create() {
			return EmspcrFactory.eINSTANCE.createTraumaTriageCriteriaSteps1and2();
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
	private static class ConstructorTestClass extends TraumaTriageCriteriaSteps1and2Operations {}

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





} // TraumaTriageCriteriaSteps1and2Operations
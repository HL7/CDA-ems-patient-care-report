
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
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestOutcomeOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest Outcome</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CardiacArrestOutcomeTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestOutcomeTemplateId() {
			OperationsTestCase<CardiacArrestOutcome> validateCardiacArrestOutcomeTemplateIdTestCase = new OperationsTestCase<CardiacArrestOutcome>(
			"validateCardiacArrestOutcomeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestOutcome target) {

			}

			@Override
			protected void updateToPass(CardiacArrestOutcome target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeTemplateId(
					(CardiacArrestOutcome) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestOutcomeTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestOutcomeCodeP() {
			OperationsTestCase<CardiacArrestOutcome> validateCardiacArrestOutcomeCodePTestCase = new OperationsTestCase<CardiacArrestOutcome>(
			"validateCardiacArrestOutcomeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestOutcome target) {

			}

			@Override
			protected void updateToPass(CardiacArrestOutcome target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeCodeP(
					(CardiacArrestOutcome) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestOutcomeCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestOutcomeCode() {
			OperationsTestCase<CardiacArrestOutcome> validateCardiacArrestOutcomeCodeTestCase = new OperationsTestCase<CardiacArrestOutcome>(
			"validateCardiacArrestOutcomeCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestOutcome target) {

			}

			@Override
			protected void updateToPass(CardiacArrestOutcome target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(CardiacArrestOutcome target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcomeCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeCode(
					(CardiacArrestOutcome) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestOutcomeCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestOutcomeMoodCode() {
			OperationsTestCase<CardiacArrestOutcome> validateCardiacArrestOutcomeMoodCodeTestCase = new OperationsTestCase<CardiacArrestOutcome>(
			"validateCardiacArrestOutcomeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestOutcome target) {

			}

			@Override
			protected void updateToPass(CardiacArrestOutcome target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeMoodCode(
					(CardiacArrestOutcome) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestOutcomeMoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestOutcomeValue() {
			OperationsTestCase<CardiacArrestOutcome> validateCardiacArrestOutcomeValueTestCase = new OperationsTestCase<CardiacArrestOutcome>(
			"validateCardiacArrestOutcomeValue",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestOutcome target) {

			}

			@Override
			protected void updateToPass(CardiacArrestOutcome target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeValue(
					(CardiacArrestOutcome) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestOutcomeValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestOutcomeValueP() {
			OperationsTestCase<CardiacArrestOutcome> validateCardiacArrestOutcomeValuePTestCase = new OperationsTestCase<CardiacArrestOutcome>(
			"validateCardiacArrestOutcomeValueP",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestOutcome target) {

			}

			@Override
			protected void updateToPass(CardiacArrestOutcome target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOutcomeOperations.validateCardiacArrestOutcomeValueP(
					(CardiacArrestOutcome) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestOutcomeValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends CardiacArrestOutcomeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CardiacArrestOutcome> {
		@Override
		public CardiacArrestOutcome create() {
			return EmspcrFactory.eINSTANCE.createCardiacArrestOutcome();
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
	private static class ConstructorTestClass extends CardiacArrestOutcomeOperations {}

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





} // CardiacArrestOutcomeOperations
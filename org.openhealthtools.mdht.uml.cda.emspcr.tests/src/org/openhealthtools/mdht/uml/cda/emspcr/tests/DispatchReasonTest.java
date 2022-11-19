
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
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchReasonOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DispatchReasonTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateDispatchReasonTemplateId() {
			OperationsTestCase<DispatchReason> validateDispatchReasonTemplateIdTestCase = new OperationsTestCase<DispatchReason>(
			"validateDispatchReasonTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DispatchReason target) {

			}

			@Override
			protected void updateToPass(DispatchReason target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DispatchReasonOperations.validateDispatchReasonTemplateId(
					(DispatchReason) objectToTest, diagnostician, map);
			}

		};

		validateDispatchReasonTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDispatchReasonMoodCode() {
			OperationsTestCase<DispatchReason> validateDispatchReasonMoodCodeTestCase = new OperationsTestCase<DispatchReason>(
			"validateDispatchReasonMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DispatchReason target) {

			}

			@Override
			protected void updateToPass(DispatchReason target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DispatchReasonOperations.validateDispatchReasonMoodCode(
					(DispatchReason) objectToTest, diagnostician, map);
			}

		};

		validateDispatchReasonMoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDispatchReasonCodeP() {
			OperationsTestCase<DispatchReason> validateDispatchReasonCodePTestCase = new OperationsTestCase<DispatchReason>(
			"validateDispatchReasonCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DispatchReason target) {

			}

			@Override
			protected void updateToPass(DispatchReason target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DispatchReasonOperations.validateDispatchReasonCodeP(
					(DispatchReason) objectToTest, diagnostician, map);
			}

		};

		validateDispatchReasonCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDispatchReasonCode() {
			OperationsTestCase<DispatchReason> validateDispatchReasonCodeTestCase = new OperationsTestCase<DispatchReason>(
			"validateDispatchReasonCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DispatchReason target) {

			}

			@Override
			protected void updateToPass(DispatchReason target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(DispatchReason target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.DispatchReasonCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DispatchReasonOperations.validateDispatchReasonCode(
					(DispatchReason) objectToTest, diagnostician, map);
			}

		};

		validateDispatchReasonCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDispatchReasonValue() {
			OperationsTestCase<DispatchReason> validateDispatchReasonValueTestCase = new OperationsTestCase<DispatchReason>(
			"validateDispatchReasonValue",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DispatchReason target) {

			}

			@Override
			protected void updateToPass(DispatchReason target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DispatchReasonOperations.validateDispatchReasonValue(
					(DispatchReason) objectToTest, diagnostician, map);
			}

		};

		validateDispatchReasonValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDispatchReasonValueP() {
			OperationsTestCase<DispatchReason> validateDispatchReasonValuePTestCase = new OperationsTestCase<DispatchReason>(
			"validateDispatchReasonValueP",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_REASON_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DispatchReason target) {

			}

			@Override
			protected void updateToPass(DispatchReason target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DispatchReasonOperations.validateDispatchReasonValueP(
					(DispatchReason) objectToTest, diagnostician, map);
			}

		};

		validateDispatchReasonValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DispatchReasonOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DispatchReason> {
		@Override
		public DispatchReason create() {
			return EmspcrFactory.eINSTANCE.createDispatchReason();
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
	private static class ConstructorTestClass extends DispatchReasonOperations {}

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





} // DispatchReasonOperations

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
import org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.TransportDispositionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transport Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition#validateTransportDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition#validateTransportDispositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Disposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition#validateTransportDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition#validateTransportDispositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Disposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition#validateTransportDispositionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Disposition Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransportDispositionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateTransportDispositionTemplateId() {
			OperationsTestCase<TransportDisposition> validateTransportDispositionTemplateIdTestCase = new OperationsTestCase<TransportDisposition>(
			"validateTransportDispositionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TransportDisposition target) {

			}

			@Override
			protected void updateToPass(TransportDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TransportDispositionOperations.validateTransportDispositionTemplateId(
					(TransportDisposition) objectToTest, diagnostician, map);
			}

		};

		validateTransportDispositionTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTransportDispositionCodeP() {
			OperationsTestCase<TransportDisposition> validateTransportDispositionCodePTestCase = new OperationsTestCase<TransportDisposition>(
			"validateTransportDispositionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TransportDisposition target) {

			}

			@Override
			protected void updateToPass(TransportDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TransportDispositionOperations.validateTransportDispositionCodeP(
					(TransportDisposition) objectToTest, diagnostician, map);
			}

		};

		validateTransportDispositionCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTransportDispositionCode() {
			OperationsTestCase<TransportDisposition> validateTransportDispositionCodeTestCase = new OperationsTestCase<TransportDisposition>(
			"validateTransportDispositionCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TransportDisposition target) {

			}

			@Override
			protected void updateToPass(TransportDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(TransportDisposition target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.TransportDispositionCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TransportDispositionOperations.validateTransportDispositionCode(
					(TransportDisposition) objectToTest, diagnostician, map);
			}

		};

		validateTransportDispositionCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTransportDispositionValue() {
			OperationsTestCase<TransportDisposition> validateTransportDispositionValueTestCase = new OperationsTestCase<TransportDisposition>(
			"validateTransportDispositionValue",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TransportDisposition target) {

			}

			@Override
			protected void updateToPass(TransportDisposition target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TransportDispositionOperations.validateTransportDispositionValue(
					(TransportDisposition) objectToTest, diagnostician, map);
			}

		};

		validateTransportDispositionValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateTransportDispositionValueP() {
			OperationsTestCase<TransportDisposition> validateTransportDispositionValuePTestCase = new OperationsTestCase<TransportDisposition>(
			"validateTransportDispositionValueP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TransportDisposition target) {

			}

			@Override
			protected void updateToPass(TransportDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TransportDispositionOperations.validateTransportDispositionValueP(
					(TransportDisposition) objectToTest, diagnostician, map);
			}

		};

		validateTransportDispositionValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends TransportDispositionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransportDisposition> {
		@Override
		public TransportDisposition create() {
			return EmspcrFactory.eINSTANCE.createTransportDisposition();
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
	private static class ConstructorTestClass extends TransportDispositionOperations {}

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





} // TransportDispositionOperations
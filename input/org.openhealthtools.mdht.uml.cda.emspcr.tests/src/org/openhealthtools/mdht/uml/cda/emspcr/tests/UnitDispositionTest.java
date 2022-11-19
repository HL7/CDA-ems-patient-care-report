
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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitDispositionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnitDispositionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateUnitDispositionTemplateId() {
			OperationsTestCase<UnitDisposition> validateUnitDispositionTemplateIdTestCase = new OperationsTestCase<UnitDisposition>(
			"validateUnitDispositionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(UnitDisposition target) {

			}

			@Override
			protected void updateToPass(UnitDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return UnitDispositionOperations.validateUnitDispositionTemplateId(
					(UnitDisposition) objectToTest, diagnostician, map);
			}

		};

		validateUnitDispositionTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateUnitDispositionCodeP() {
			OperationsTestCase<UnitDisposition> validateUnitDispositionCodePTestCase = new OperationsTestCase<UnitDisposition>(
			"validateUnitDispositionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(UnitDisposition target) {

			}

			@Override
			protected void updateToPass(UnitDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return UnitDispositionOperations.validateUnitDispositionCodeP(
					(UnitDisposition) objectToTest, diagnostician, map);
			}

		};

		validateUnitDispositionCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateUnitDispositionCode() {
			OperationsTestCase<UnitDisposition> validateUnitDispositionCodeTestCase = new OperationsTestCase<UnitDisposition>(
			"validateUnitDispositionCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(UnitDisposition target) {

			}

			@Override
			protected void updateToPass(UnitDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(UnitDisposition target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.UnitDispositionCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return UnitDispositionOperations.validateUnitDispositionCode(
					(UnitDisposition) objectToTest, diagnostician, map);
			}

		};

		validateUnitDispositionCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateUnitDispositionValue() {
			OperationsTestCase<UnitDisposition> validateUnitDispositionValueTestCase = new OperationsTestCase<UnitDisposition>(
			"validateUnitDispositionValue",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(UnitDisposition target) {

			}

			@Override
			protected void updateToPass(UnitDisposition target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return UnitDispositionOperations.validateUnitDispositionValue(
					(UnitDisposition) objectToTest, diagnostician, map);
			}

		};

		validateUnitDispositionValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateUnitDispositionValueP() {
			OperationsTestCase<UnitDisposition> validateUnitDispositionValuePTestCase = new OperationsTestCase<UnitDisposition>(
			"validateUnitDispositionValueP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(UnitDisposition target) {

			}

			@Override
			protected void updateToPass(UnitDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return UnitDispositionOperations.validateUnitDispositionValueP(
					(UnitDisposition) objectToTest, diagnostician, map);
			}

		};

		validateUnitDispositionValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends UnitDispositionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnitDisposition> {
		@Override
		public UnitDisposition create() {
			return EmspcrFactory.eINSTANCE.createUnitDisposition();
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
	private static class ConstructorTestClass extends UnitDispositionOperations {}

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





} // UnitDispositionOperations
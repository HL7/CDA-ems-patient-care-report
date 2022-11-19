
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
import org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DestinationWardOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Destination Ward</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard#validateDestinationWardValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Ward Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DestinationWardTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateDestinationWardTemplateId() {
			OperationsTestCase<DestinationWard> validateDestinationWardTemplateIdTestCase = new OperationsTestCase<DestinationWard>(
			"validateDestinationWardTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_WARD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DestinationWard target) {

			}

			@Override
			protected void updateToPass(DestinationWard target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DestinationWardOperations.validateDestinationWardTemplateId(
					(DestinationWard) objectToTest, diagnostician, map);
			}

		};

		validateDestinationWardTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDestinationWardClassCode() {
			OperationsTestCase<DestinationWard> validateDestinationWardClassCodeTestCase = new OperationsTestCase<DestinationWard>(
			"validateDestinationWardClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_WARD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DestinationWard target) {

			}

			@Override
			protected void updateToPass(DestinationWard target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DestinationWardOperations.validateDestinationWardClassCode(
					(DestinationWard) objectToTest, diagnostician, map);
			}

		};

		validateDestinationWardClassCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDestinationWardCodeP() {
			OperationsTestCase<DestinationWard> validateDestinationWardCodePTestCase = new OperationsTestCase<DestinationWard>(
			"validateDestinationWardCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_WARD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DestinationWard target) {

			}

			@Override
			protected void updateToPass(DestinationWard target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DestinationWardOperations.validateDestinationWardCodeP(
					(DestinationWard) objectToTest, diagnostician, map);
			}

		};

		validateDestinationWardCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDestinationWardCode() {
			OperationsTestCase<DestinationWard> validateDestinationWardCodeTestCase = new OperationsTestCase<DestinationWard>(
			"validateDestinationWardCode",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_WARD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DestinationWard target) {

			}

			@Override
			protected void updateToPass(DestinationWard target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(DestinationWard target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.DestinationWardCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DestinationWardOperations.validateDestinationWardCode(
					(DestinationWard) objectToTest, diagnostician, map);
			}

		};

		validateDestinationWardCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDestinationWardMoodCode() {
			OperationsTestCase<DestinationWard> validateDestinationWardMoodCodeTestCase = new OperationsTestCase<DestinationWard>(
			"validateDestinationWardMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_WARD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DestinationWard target) {

			}

			@Override
			protected void updateToPass(DestinationWard target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DestinationWardOperations.validateDestinationWardMoodCode(
					(DestinationWard) objectToTest, diagnostician, map);
			}

		};

		validateDestinationWardMoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDestinationWardValue() {
			OperationsTestCase<DestinationWard> validateDestinationWardValueTestCase = new OperationsTestCase<DestinationWard>(
			"validateDestinationWardValue",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_WARD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DestinationWard target) {

			}

			@Override
			protected void updateToPass(DestinationWard target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DestinationWardOperations.validateDestinationWardValue(
					(DestinationWard) objectToTest, diagnostician, map);
			}

		};

		validateDestinationWardValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateDestinationWardValueP() {
			OperationsTestCase<DestinationWard> validateDestinationWardValuePTestCase = new OperationsTestCase<DestinationWard>(
			"validateDestinationWardValueP",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_WARD_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DestinationWard target) {

			}

			@Override
			protected void updateToPass(DestinationWard target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DestinationWardOperations.validateDestinationWardValueP(
					(DestinationWard) objectToTest, diagnostician, map);
			}

		};

		validateDestinationWardValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DestinationWardOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DestinationWard> {
		@Override
		public DestinationWard create() {
			return EmspcrFactory.eINSTANCE.createDestinationWard();
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
	private static class ConstructorTestClass extends DestinationWardOperations {}

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





} // DestinationWardOperations
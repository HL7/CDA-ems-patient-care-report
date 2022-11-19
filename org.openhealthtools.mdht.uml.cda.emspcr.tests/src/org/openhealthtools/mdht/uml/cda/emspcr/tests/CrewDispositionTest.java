
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
import org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CrewDispositionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Crew Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition#validateCrewDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition#validateCrewDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition#validateCrewDispositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition#validateCrewDispositionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CrewDispositionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateCrewDispositionTemplateId() {
			OperationsTestCase<CrewDisposition> validateCrewDispositionTemplateIdTestCase = new OperationsTestCase<CrewDisposition>(
			"validateCrewDispositionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CREW_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CrewDisposition target) {

			}

			@Override
			protected void updateToPass(CrewDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CrewDispositionOperations.validateCrewDispositionTemplateId(
					(CrewDisposition) objectToTest, diagnostician, map);
			}

		};

		validateCrewDispositionTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateCrewDispositionCode() {
			OperationsTestCase<CrewDisposition> validateCrewDispositionCodeTestCase = new OperationsTestCase<CrewDisposition>(
			"validateCrewDispositionCode",
			operationsForOCL.getOCLValue("VALIDATE_CREW_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CrewDisposition target) {

			}

			@Override
			protected void updateToPass(CrewDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CrewDispositionOperations.validateCrewDispositionCode(
					(CrewDisposition) objectToTest, diagnostician, map);
			}

		};

		validateCrewDispositionCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateCrewDispositionValue() {
			OperationsTestCase<CrewDisposition> validateCrewDispositionValueTestCase = new OperationsTestCase<CrewDisposition>(
			"validateCrewDispositionValue",
			operationsForOCL.getOCLValue("VALIDATE_CREW_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CrewDisposition target) {

			}

			@Override
			protected void updateToPass(CrewDisposition target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CrewDispositionOperations.validateCrewDispositionValue(
					(CrewDisposition) objectToTest, diagnostician, map);
			}

		};

		validateCrewDispositionValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateCrewDispositionValueP() {
			OperationsTestCase<CrewDisposition> validateCrewDispositionValuePTestCase = new OperationsTestCase<CrewDisposition>(
			"validateCrewDispositionValueP",
			operationsForOCL.getOCLValue("VALIDATE_CREW_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CrewDisposition target) {

			}

			@Override
			protected void updateToPass(CrewDisposition target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CrewDispositionOperations.validateCrewDispositionValueP(
					(CrewDisposition) objectToTest, diagnostician, map);
			}

		};

		validateCrewDispositionValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends CrewDispositionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CrewDisposition> {
		@Override
		public CrewDisposition create() {
			return EmspcrFactory.eINSTANCE.createCrewDisposition();
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
	private static class ConstructorTestClass extends CrewDispositionOperations {}

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





} // CrewDispositionOperations
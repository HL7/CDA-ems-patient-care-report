
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
import org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ChestAssessmentOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chest Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment#validateChestAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment#validateChestAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment#validateChestAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment#validateChestAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment#validateChestAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment#validateChestAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Assessment Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessment#validateChestAssessmentTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Assessment Target Site Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ChestAssessmentTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateChestAssessmentTemplateId() {
			OperationsTestCase<ChestAssessment> validateChestAssessmentTemplateIdTestCase = new OperationsTestCase<ChestAssessment>(
			"validateChestAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ChestAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ChestAssessmentOperations.validateChestAssessmentTemplateId(
					(ChestAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAssessmentTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateChestAssessmentCodeP() {
			OperationsTestCase<ChestAssessment> validateChestAssessmentCodePTestCase = new OperationsTestCase<ChestAssessment>(
			"validateChestAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ChestAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ChestAssessmentOperations.validateChestAssessmentCodeP(
					(ChestAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAssessmentCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateChestAssessmentCode() {
			OperationsTestCase<ChestAssessment> validateChestAssessmentCodeTestCase = new OperationsTestCase<ChestAssessment>(
			"validateChestAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ChestAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(ChestAssessment target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.ChestAssessmentCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ChestAssessmentOperations.validateChestAssessmentCode(
					(ChestAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAssessmentCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateChestAssessmentValue() {
			OperationsTestCase<ChestAssessment> validateChestAssessmentValueTestCase = new OperationsTestCase<ChestAssessment>(
			"validateChestAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ChestAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAssessment target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ChestAssessmentOperations.validateChestAssessmentValue(
					(ChestAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAssessmentValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateChestAssessmentValueP() {
			OperationsTestCase<ChestAssessment> validateChestAssessmentValuePTestCase = new OperationsTestCase<ChestAssessment>(
			"validateChestAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ChestAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ChestAssessmentOperations.validateChestAssessmentValueP(
					(ChestAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAssessmentValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateChestAssessmentTargetSiteCode() {
			OperationsTestCase<ChestAssessment> validateChestAssessmentTargetSiteCodeTestCase = new OperationsTestCase<ChestAssessment>(
			"validateChestAssessmentTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ChestAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ChestAssessmentOperations.validateChestAssessmentTargetSiteCode(
					(ChestAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAssessmentTargetSiteCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateChestAssessmentTargetSiteCodeP() {
			OperationsTestCase<ChestAssessment> validateChestAssessmentTargetSiteCodePTestCase = new OperationsTestCase<ChestAssessment>(
			"validateChestAssessmentTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ChestAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ChestAssessmentOperations.validateChestAssessmentTargetSiteCodeP(
					(ChestAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAssessmentTargetSiteCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ChestAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChestAssessment> {
		@Override
		public ChestAssessment create() {
			return EmspcrFactory.eINSTANCE.createChestAssessment();
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
	private static class ConstructorTestClass extends ChestAssessmentOperations {}

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





} // ChestAssessmentOperations
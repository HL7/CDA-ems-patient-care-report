
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
import org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.LungAssessmentOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Lung Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment#validateLungAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lung Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment#validateLungAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lung Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment#validateLungAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lung Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment#validateLungAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lung Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment#validateLungAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lung Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment#validateLungAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lung Assessment Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LungAssessment#validateLungAssessmentTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lung Assessment Target Site Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LungAssessmentTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateLungAssessmentTemplateId() {
			OperationsTestCase<LungAssessment> validateLungAssessmentTemplateIdTestCase = new OperationsTestCase<LungAssessment>(
			"validateLungAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LUNG_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LungAssessment target) {

			}

			@Override
			protected void updateToPass(LungAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LungAssessmentOperations.validateLungAssessmentTemplateId(
					(LungAssessment) objectToTest, diagnostician, map);
			}

		};

		validateLungAssessmentTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateLungAssessmentCodeP() {
			OperationsTestCase<LungAssessment> validateLungAssessmentCodePTestCase = new OperationsTestCase<LungAssessment>(
			"validateLungAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LUNG_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LungAssessment target) {

			}

			@Override
			protected void updateToPass(LungAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LungAssessmentOperations.validateLungAssessmentCodeP(
					(LungAssessment) objectToTest, diagnostician, map);
			}

		};

		validateLungAssessmentCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateLungAssessmentCode() {
			OperationsTestCase<LungAssessment> validateLungAssessmentCodeTestCase = new OperationsTestCase<LungAssessment>(
			"validateLungAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_LUNG_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LungAssessment target) {

			}

			@Override
			protected void updateToPass(LungAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(LungAssessment target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.LungAssessmentCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LungAssessmentOperations.validateLungAssessmentCode(
					(LungAssessment) objectToTest, diagnostician, map);
			}

		};

		validateLungAssessmentCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateLungAssessmentValue() {
			OperationsTestCase<LungAssessment> validateLungAssessmentValueTestCase = new OperationsTestCase<LungAssessment>(
			"validateLungAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_LUNG_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LungAssessment target) {

			}

			@Override
			protected void updateToPass(LungAssessment target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LungAssessmentOperations.validateLungAssessmentValue(
					(LungAssessment) objectToTest, diagnostician, map);
			}

		};

		validateLungAssessmentValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateLungAssessmentValueP() {
			OperationsTestCase<LungAssessment> validateLungAssessmentValuePTestCase = new OperationsTestCase<LungAssessment>(
			"validateLungAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_LUNG_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LungAssessment target) {

			}

			@Override
			protected void updateToPass(LungAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LungAssessmentOperations.validateLungAssessmentValueP(
					(LungAssessment) objectToTest, diagnostician, map);
			}

		};

		validateLungAssessmentValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateLungAssessmentTargetSiteCode() {
			OperationsTestCase<LungAssessment> validateLungAssessmentTargetSiteCodeTestCase = new OperationsTestCase<LungAssessment>(
			"validateLungAssessmentTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_LUNG_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LungAssessment target) {

			}

			@Override
			protected void updateToPass(LungAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LungAssessmentOperations.validateLungAssessmentTargetSiteCode(
					(LungAssessment) objectToTest, diagnostician, map);
			}

		};

		validateLungAssessmentTargetSiteCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateLungAssessmentTargetSiteCodeP() {
			OperationsTestCase<LungAssessment> validateLungAssessmentTargetSiteCodePTestCase = new OperationsTestCase<LungAssessment>(
			"validateLungAssessmentTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LUNG_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LungAssessment target) {

			}

			@Override
			protected void updateToPass(LungAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LungAssessmentOperations.validateLungAssessmentTargetSiteCodeP(
					(LungAssessment) objectToTest, diagnostician, map);
			}

		};

		validateLungAssessmentTargetSiteCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends LungAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LungAssessment> {
		@Override
		public LungAssessment create() {
			return EmspcrFactory.eINSTANCE.createLungAssessment();
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
	private static class ConstructorTestClass extends LungAssessmentOperations {}

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





} // LungAssessmentOperations
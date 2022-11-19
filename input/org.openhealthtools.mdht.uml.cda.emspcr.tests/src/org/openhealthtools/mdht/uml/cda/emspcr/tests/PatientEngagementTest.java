
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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientEngagementOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Engagement</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement#validatePatientEngagementTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Engagement Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement#validatePatientEngagementCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Engagement Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement#validatePatientEngagementCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Engagement Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement#validatePatientEngagementValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Engagement Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement#validatePatientEngagementValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Engagement Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientEngagementTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidatePatientEngagementTemplateId() {
			OperationsTestCase<PatientEngagement> validatePatientEngagementTemplateIdTestCase = new OperationsTestCase<PatientEngagement>(
			"validatePatientEngagementTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ENGAGEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientEngagement target) {

			}

			@Override
			protected void updateToPass(PatientEngagement target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientEngagementOperations.validatePatientEngagementTemplateId(
					(PatientEngagement) objectToTest, diagnostician, map);
			}

		};

		validatePatientEngagementTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientEngagementCodeP() {
			OperationsTestCase<PatientEngagement> validatePatientEngagementCodePTestCase = new OperationsTestCase<PatientEngagement>(
			"validatePatientEngagementCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ENGAGEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientEngagement target) {

			}

			@Override
			protected void updateToPass(PatientEngagement target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientEngagementOperations.validatePatientEngagementCodeP(
					(PatientEngagement) objectToTest, diagnostician, map);
			}

		};

		validatePatientEngagementCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientEngagementCode() {
			OperationsTestCase<PatientEngagement> validatePatientEngagementCodeTestCase = new OperationsTestCase<PatientEngagement>(
			"validatePatientEngagementCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ENGAGEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientEngagement target) {

			}

			@Override
			protected void updateToPass(PatientEngagement target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(PatientEngagement target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagementCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientEngagementOperations.validatePatientEngagementCode(
					(PatientEngagement) objectToTest, diagnostician, map);
			}

		};

		validatePatientEngagementCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientEngagementValue() {
			OperationsTestCase<PatientEngagement> validatePatientEngagementValueTestCase = new OperationsTestCase<PatientEngagement>(
			"validatePatientEngagementValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ENGAGEMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientEngagement target) {

			}

			@Override
			protected void updateToPass(PatientEngagement target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientEngagementOperations.validatePatientEngagementValue(
					(PatientEngagement) objectToTest, diagnostician, map);
			}

		};

		validatePatientEngagementValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidatePatientEngagementValueP() {
			OperationsTestCase<PatientEngagement> validatePatientEngagementValuePTestCase = new OperationsTestCase<PatientEngagement>(
			"validatePatientEngagementValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ENGAGEMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PatientEngagement target) {

			}

			@Override
			protected void updateToPass(PatientEngagement target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PatientEngagementOperations.validatePatientEngagementValueP(
					(PatientEngagement) objectToTest, diagnostician, map);
			}

		};

		validatePatientEngagementValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends PatientEngagementOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientEngagement> {
		@Override
		public PatientEngagement create() {
			return EmspcrFactory.eINSTANCE.createPatientEngagement();
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
	private static class ConstructorTestClass extends PatientEngagementOperations {}

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





} // PatientEngagementOperations
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.SkinAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Skin Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment#validateSkinAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Skin Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment#validateSkinAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Skin Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment#validateSkinAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Skin Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment#validateSkinAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Skin Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment#validateSkinAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Skin Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment#validateSkinAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Skin Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment#validateSkinAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Skin Assessment Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SkinAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSkinAssessmentTemplateId() {
			OperationsTestCase<SkinAssessment> validateSkinAssessmentTemplateIdTestCase = new OperationsTestCase<SkinAssessment>(
			"validateSkinAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SKIN_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SkinAssessment target) {

			}

			@Override
			protected void updateToPass(SkinAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SkinAssessmentOperations.validateSkinAssessmentTemplateId(
					(SkinAssessment) objectToTest, diagnostician, map);
			}

		};

		validateSkinAssessmentTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSkinAssessmentMoodCode() {
			OperationsTestCase<SkinAssessment> validateSkinAssessmentMoodCodeTestCase = new OperationsTestCase<SkinAssessment>(
			"validateSkinAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SKIN_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SkinAssessment target) {

			}

			@Override
			protected void updateToPass(SkinAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SkinAssessmentOperations.validateSkinAssessmentMoodCode(
					(SkinAssessment) objectToTest, diagnostician, map);
			}

		};

		validateSkinAssessmentMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSkinAssessmentCodeP() {
			OperationsTestCase<SkinAssessment> validateSkinAssessmentCodePTestCase = new OperationsTestCase<SkinAssessment>(
			"validateSkinAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SKIN_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SkinAssessment target) {

			}

			@Override
			protected void updateToPass(SkinAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SkinAssessmentOperations.validateSkinAssessmentCodeP(
					(SkinAssessment) objectToTest, diagnostician, map);
			}

		};

		validateSkinAssessmentCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSkinAssessmentCode() {
			OperationsTestCase<SkinAssessment> validateSkinAssessmentCodeTestCase = new OperationsTestCase<SkinAssessment>(
			"validateSkinAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_SKIN_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SkinAssessment target) {

			}

			@Override
			protected void updateToPass(SkinAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(SkinAssessment target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessmentCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SkinAssessmentOperations.validateSkinAssessmentCode(
					(SkinAssessment) objectToTest, diagnostician, map);
			}

		};

		validateSkinAssessmentCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateSkinAssessmentEffectiveTime() {
			OperationsTestCase<SkinAssessment> validateSkinAssessmentEffectiveTimeTestCase = new OperationsTestCase<SkinAssessment>(
			"validateSkinAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SKIN_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SkinAssessment target) {

			}

			@Override
			protected void updateToPass(SkinAssessment target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SkinAssessmentOperations.validateSkinAssessmentEffectiveTime(
					(SkinAssessment) objectToTest, diagnostician, map);
			}

		};

		validateSkinAssessmentEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSkinAssessmentValue() {
			OperationsTestCase<SkinAssessment> validateSkinAssessmentValueTestCase = new OperationsTestCase<SkinAssessment>(
			"validateSkinAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_SKIN_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SkinAssessment target) {

			}

			@Override
			protected void updateToPass(SkinAssessment target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SkinAssessmentOperations.validateSkinAssessmentValue(
					(SkinAssessment) objectToTest, diagnostician, map);
			}

		};

		validateSkinAssessmentValueTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSkinAssessmentValueP() {
			OperationsTestCase<SkinAssessment> validateSkinAssessmentValuePTestCase = new OperationsTestCase<SkinAssessment>(
			"validateSkinAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_SKIN_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SkinAssessment target) {

			}

			@Override
			protected void updateToPass(SkinAssessment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SkinAssessmentOperations.validateSkinAssessmentValueP(
					(SkinAssessment) objectToTest, diagnostician, map);
			}

		};

		validateSkinAssessmentValuePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SkinAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SkinAssessment> {
		@Override
		public SkinAssessment create() {
			return EmspcrFactory.eINSTANCE.createSkinAssessment();
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
	private static class ConstructorTestClass extends SkinAssessmentOperations {
	}

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

} // SkinAssessmentOperations

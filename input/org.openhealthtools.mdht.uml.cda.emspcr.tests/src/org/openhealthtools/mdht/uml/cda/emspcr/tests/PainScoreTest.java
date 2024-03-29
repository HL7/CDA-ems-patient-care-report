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
import org.openhealthtools.mdht.uml.cda.emspcr.PainScore;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PainScoreOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pain Score</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PainScore#validatePainScoreTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pain Score Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PainScore#validatePainScoreMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pain Score Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PainScore#validatePainScoreCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pain Score Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PainScore#validatePainScoreCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pain Score Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PainScore#validatePainScoreEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pain Score Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PainScore#validatePainScoreValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pain Score Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PainScoreTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePainScoreTemplateId() {
			OperationsTestCase<PainScore> validatePainScoreTemplateIdTestCase = new OperationsTestCase<PainScore>(
			"validatePainScoreTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PAIN_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PainScore target) {

			}

			@Override
			protected void updateToPass(PainScore target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PainScoreOperations.validatePainScoreTemplateId(
					(PainScore) objectToTest, diagnostician, map);
			}

		};

		validatePainScoreTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePainScoreMoodCode() {
			OperationsTestCase<PainScore> validatePainScoreMoodCodeTestCase = new OperationsTestCase<PainScore>(
			"validatePainScoreMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PAIN_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PainScore target) {

			}

			@Override
			protected void updateToPass(PainScore target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PainScoreOperations.validatePainScoreMoodCode(
					(PainScore) objectToTest, diagnostician, map);
			}

		};

		validatePainScoreMoodCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidatePainScoreCodeP() {
			OperationsTestCase<PainScore> validatePainScoreCodePTestCase = new OperationsTestCase<PainScore>(
			"validatePainScoreCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PAIN_SCORE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PainScore target) {

			}

			@Override
			protected void updateToPass(PainScore target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PainScoreOperations.validatePainScoreCodeP(
					(PainScore) objectToTest, diagnostician, map);
			}

		};

		validatePainScoreCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePainScoreCode() {
			OperationsTestCase<PainScore> validatePainScoreCodeTestCase = new OperationsTestCase<PainScore>(
			"validatePainScoreCode",
			operationsForOCL.getOCLValue("VALIDATE_PAIN_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PainScore target) {

			}

			@Override
			protected void updateToPass(PainScore target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(PainScore target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.PainScoreCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PainScoreOperations.validatePainScoreCode(
					(PainScore) objectToTest, diagnostician, map);
			}

		};

		validatePainScoreCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePainScoreEffectiveTime() {
			OperationsTestCase<PainScore> validatePainScoreEffectiveTimeTestCase = new OperationsTestCase<PainScore>(
			"validatePainScoreEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PAIN_SCORE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PainScore target) {

			}

			@Override
			protected void updateToPass(PainScore target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PainScoreOperations.validatePainScoreEffectiveTime(
					(PainScore) objectToTest, diagnostician, map);
			}

		};

		validatePainScoreEffectiveTimeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidatePainScoreValue() {
			OperationsTestCase<PainScore> validatePainScoreValueTestCase = new OperationsTestCase<PainScore>(
			"validatePainScoreValue",
			operationsForOCL.getOCLValue("VALIDATE_PAIN_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PainScore target) {

			}

			@Override
			protected void updateToPass(PainScore target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PainScoreOperations.validatePainScoreValue(
					(PainScore) objectToTest, diagnostician, map);
			}

		};

		validatePainScoreValueTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PainScoreOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PainScore> {
		@Override
		public PainScore create() {
			return EmspcrFactory.eINSTANCE.createPainScore();
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
	private static class ConstructorTestClass extends PainScoreOperations {
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

} // PainScoreOperations

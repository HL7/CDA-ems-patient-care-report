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
import org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.RespiratoryRateOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Respiratory Rate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RespiratoryRateTest extends CDAValidationTest {

	/**
*
* @generated
*/
@Test



public void testValidateRespiratoryRateTemplateId() {
			OperationsTestCase<RespiratoryRate> validateRespiratoryRateTemplateIdTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RespiratoryRateOperations.validateRespiratoryRateTemplateId(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratoryRateMoodCode() {
			OperationsTestCase<RespiratoryRate> validateRespiratoryRateMoodCodeTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RespiratoryRateOperations.validateRespiratoryRateMoodCode(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateMoodCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateRespiratoryRateCodeP() {
			OperationsTestCase<RespiratoryRate> validateRespiratoryRateCodePTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RespiratoryRateOperations.validateRespiratoryRateCodeP(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratoryRateCode() {
			OperationsTestCase<RespiratoryRate> validateRespiratoryRateCodeTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(RespiratoryRate target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRateCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RespiratoryRateOperations.validateRespiratoryRateCode(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratoryRateEffectiveTime() {
			OperationsTestCase<RespiratoryRate> validateRespiratoryRateEffectiveTimeTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RespiratoryRateOperations.validateRespiratoryRateEffectiveTime(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratoryRateValue() {
			OperationsTestCase<RespiratoryRate> validateRespiratoryRateValueTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateValue",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RespiratoryRateOperations.validateRespiratoryRateValue(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateValueTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RespiratoryRateOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RespiratoryRate> {
		@Override
		public RespiratoryRate create() {
			return EmspcrFactory.eINSTANCE.createRespiratoryRate();
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
	private static class ConstructorTestClass extends RespiratoryRateOperations {
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

} // RespiratoryRateOperations

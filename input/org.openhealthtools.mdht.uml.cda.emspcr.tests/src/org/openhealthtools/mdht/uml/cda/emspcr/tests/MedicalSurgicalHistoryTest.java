
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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicalSurgicalHistoryOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Surgical History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Negation Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicalSurgicalHistoryTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test



public void testValidateMedicalSurgicalHistoryTemplateId() {
			OperationsTestCase<MedicalSurgicalHistory> validateMedicalSurgicalHistoryTemplateIdTestCase = new OperationsTestCase<MedicalSurgicalHistory>(
			"validateMedicalSurgicalHistoryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SURGICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalSurgicalHistory target) {

			}

			@Override
			protected void updateToPass(MedicalSurgicalHistory target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryTemplateId(
					(MedicalSurgicalHistory) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSurgicalHistoryTemplateIdTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateMedicalSurgicalHistoryMoodCode() {
			OperationsTestCase<MedicalSurgicalHistory> validateMedicalSurgicalHistoryMoodCodeTestCase = new OperationsTestCase<MedicalSurgicalHistory>(
			"validateMedicalSurgicalHistoryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SURGICAL_HISTORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalSurgicalHistory target) {

			}

			@Override
			protected void updateToPass(MedicalSurgicalHistory target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryMoodCode(
					(MedicalSurgicalHistory) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSurgicalHistoryMoodCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateMedicalSurgicalHistoryCodeP() {
			OperationsTestCase<MedicalSurgicalHistory> validateMedicalSurgicalHistoryCodePTestCase = new OperationsTestCase<MedicalSurgicalHistory>(
			"validateMedicalSurgicalHistoryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalSurgicalHistory target) {

			}

			@Override
			protected void updateToPass(MedicalSurgicalHistory target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryCodeP(
					(MedicalSurgicalHistory) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSurgicalHistoryCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateMedicalSurgicalHistoryCode() {
			OperationsTestCase<MedicalSurgicalHistory> validateMedicalSurgicalHistoryCodeTestCase = new OperationsTestCase<MedicalSurgicalHistory>(
			"validateMedicalSurgicalHistoryCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalSurgicalHistory target) {

			}

			@Override
			protected void updateToPass(MedicalSurgicalHistory target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryCode(
					(MedicalSurgicalHistory) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSurgicalHistoryCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateMedicalSurgicalHistoryValue() {
			OperationsTestCase<MedicalSurgicalHistory> validateMedicalSurgicalHistoryValueTestCase = new OperationsTestCase<MedicalSurgicalHistory>(
			"validateMedicalSurgicalHistoryValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalSurgicalHistory target) {

			}

			@Override
			protected void updateToPass(MedicalSurgicalHistory target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryValue(
					(MedicalSurgicalHistory) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSurgicalHistoryValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateMedicalSurgicalHistoryValueP() {
			OperationsTestCase<MedicalSurgicalHistory> validateMedicalSurgicalHistoryValuePTestCase = new OperationsTestCase<MedicalSurgicalHistory>(
			"validateMedicalSurgicalHistoryValueP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalSurgicalHistory target) {

			}

			@Override
			protected void updateToPass(MedicalSurgicalHistory target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryValueP(
					(MedicalSurgicalHistory) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSurgicalHistoryValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test



public void testValidateMedicalSurgicalHistoryNegationInd() {
			OperationsTestCase<MedicalSurgicalHistory> validateMedicalSurgicalHistoryNegationIndTestCase = new OperationsTestCase<MedicalSurgicalHistory>(
			"validateMedicalSurgicalHistoryNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SURGICAL_HISTORY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalSurgicalHistory target) {

			}

			@Override
			protected void updateToPass(MedicalSurgicalHistory target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalSurgicalHistoryOperations.validateMedicalSurgicalHistoryNegationInd(
					(MedicalSurgicalHistory) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSurgicalHistoryNegationIndTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends MedicalSurgicalHistoryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalSurgicalHistory> {
		@Override
		public MedicalSurgicalHistory create() {
			return EmspcrFactory.eINSTANCE.createMedicalSurgicalHistory();
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
	private static class ConstructorTestClass extends MedicalSurgicalHistoryOperations {}

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





} // MedicalSurgicalHistoryOperations
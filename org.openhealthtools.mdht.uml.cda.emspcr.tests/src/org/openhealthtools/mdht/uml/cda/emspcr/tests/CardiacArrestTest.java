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
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestCardiacArrestCauseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cardiac Arrest Cause Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestCardiacArrestInformantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cardiac Arrest Informant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestSpontaneousCirculationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Spontaneous Circulation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestDestinationRhythmRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Destination Rhythm Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestArrestRhythmRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Arrest Rhythm Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestCardiacArrestTimingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cardiac Arrest Timing Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest#validateCardiacArrestCardiacArrestOutcomeRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cardiac Arrest Outcome Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CardiacArrestTest extends CDAValidationTest {

	/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestCardiacArrestCauseRelationship() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestCardiacArrestCauseRelationshipTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestCardiacArrestCauseRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestCardiacArrestCauseRelationship(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCardiacArrestCauseRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestCardiacArrestInformantParticipation() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestCardiacArrestInformantParticipationTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestCardiacArrestInformantParticipation",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestCardiacArrestInformantParticipation(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCardiacArrestInformantParticipationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestSpontaneousCirculationRelationship() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestSpontaneousCirculationRelationshipTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestSpontaneousCirculationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestSpontaneousCirculationRelationship(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestSpontaneousCirculationRelationshipTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestDestinationRhythmRelationship() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestDestinationRhythmRelationshipTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestDestinationRhythmRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestDestinationRhythmRelationship(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestDestinationRhythmRelationshipTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestArrestRhythmRelationship() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestArrestRhythmRelationshipTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestArrestRhythmRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestArrestRhythmRelationship(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestArrestRhythmRelationshipTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestTemplateId() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestTemplateIdTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestTemplateId(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestMoodCode() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestMoodCodeTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestMoodCode(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestCode() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestCodeTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestCode(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestNegationInd() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestNegationIndTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestNegationInd(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestNegationIndTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestEffectiveTime() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestEffectiveTimeTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestEffectiveTime(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestValue() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestValueTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestValue",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestValue(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestValueTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestCardiacArrestTimingRelationship() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestCardiacArrestTimingRelationshipTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestCardiacArrestTimingRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CARDIAC_ARREST_TIMING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestCardiacArrestTimingRelationship(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCardiacArrestTimingRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateCardiacArrestCardiacArrestOutcomeRelationship() {
			OperationsTestCase<CardiacArrest> validateCardiacArrestCardiacArrestOutcomeRelationshipTestCase = new OperationsTestCase<CardiacArrest>(
			"validateCardiacArrestCardiacArrestOutcomeRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CARDIAC_ARREST_OUTCOME_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CardiacArrest target) {

			}

			@Override
			protected void updateToPass(CardiacArrest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CardiacArrestOperations.validateCardiacArrestCardiacArrestOutcomeRelationship(
					(CardiacArrest) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCardiacArrestOutcomeRelationshipTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CardiacArrestOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CardiacArrest> {
		@Override
		public CardiacArrest create() {
			return EmspcrFactory.eINSTANCE.createCardiacArrest();
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
	private static class ConstructorTestClass extends CardiacArrestOperations {
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

} // CardiacArrestOperations

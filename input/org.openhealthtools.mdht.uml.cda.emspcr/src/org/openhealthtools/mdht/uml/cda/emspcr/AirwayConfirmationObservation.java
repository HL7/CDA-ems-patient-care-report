/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airway Confirmation Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getAirwayConfirmationObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AirwayConfirmationObservationTemplateId AirwayConfirmationObservationMoodCode AirwayConfirmationObservationCode AirwayConfirmationObservationCodeP AirwayConfirmationObservationEffectiveTime AirwayConfirmationObservationValue AirwayConfirmationObservationMethodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.175' templateId.extension='2022-01-01' moodCode='EVN' code.code='71576-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Airway device placement confirmation NEMSIS' constraints.validation.dependOn.AirwayConfirmationObservationCode='AirwayConfirmationObservationCodeP' methodCode.codeSystem='2.16.840.1.113883.6.1' methodCode.codeSystemName='LOINC' constraints.validation.info='AirwayConfirmationObservationMethodCodeP' constraints.validation.dependOn.AirwayConfirmationObservationMethodCode='AirwayConfirmationObservationMethodCodeP'"
 * @generated
 */
public interface AirwayConfirmationObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.175\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateAirwayConfirmationObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateAirwayConfirmationObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAirwayConfirmationObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'71576-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateAirwayConfirmationObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAirwayConfirmationObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() =  1 and self.value-&gt;forAll(element | element.oclIsTypeOf(datatypes::BL)))'"
	 * @generated
	 */
	boolean validateAirwayConfirmationObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode-&gt;isEmpty() or self.methodCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateAirwayConfirmationObservationMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode-&gt;isEmpty() or self.methodCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.methodCode-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA18672-8\' or value.code = \'LA18673-6\' or value.code = \'LA18674-4\' or value.code = \'LA18675-1\' or value.code = \'LA18676-9\' or value.code = \'LA18677-7\' or value.code = \'LA18678-5\' or value.code = \'LA18680-1\' or value.code = \'LA18681-9\' or value.code = \'LA18679-3\' or value.code = \'LA32909-6\')))'"
	 * @generated
	 */
	boolean validateAirwayConfirmationObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirwayConfirmationObservation init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AirwayConfirmationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AirwayConfirmationObservation

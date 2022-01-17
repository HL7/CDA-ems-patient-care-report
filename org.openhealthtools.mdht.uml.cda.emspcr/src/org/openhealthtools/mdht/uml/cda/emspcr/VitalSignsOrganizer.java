/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getVitalSignsOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VitalSignsOrganizerSystolicBloodPressureComponent VitalSignsOrganizerRespiratoryRateComponent VitalSignsOrganizerOxygenSaturationComponent VitalSignsOrganizerTemplateId VitalSignsOrganizerCodeP VitalSignsOrganizerEffectiveTime VitalSignsOrganizerComponent42' constraints.validation.warning='VitalSignsOrganizerBodyTemperatureComponent VitalSignsOrganizerCode' templateId.root='2.16.840.1.1133883.17.3.10.1.28' templateId.extension='2022-01-01' code.code='46680005' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMED CT' code.displayName='Vital signs' constraints.validation.info='VitalSignsOrganizerComponent4 VitalSignsOrganizerComponent43'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerSystolicBloodPressureComponent constraints.validation.error='VitalSignsOrganizerSystolicBloodPressureComponentSystolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerRespiratoryRateComponent constraints.validation.error='VitalSignsOrganizerRespiratoryRateComponentRespiratoryRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerBodyTemperatureComponent constraints.validation.error='VitalSignsOrganizerBodyTemperatureComponentBodyTemperature'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerOxygenSaturationComponent constraints.validation.error='VitalSignsOrganizerOxygenSaturationComponentOxygenSaturation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerDiastolicBloodPressureComponent constraints.validation.error='VitalSignsOrganizerDiastolicBloodPressureComponentObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerPriorAidVitals constraints.validation.error='VitalSignsOrganizerPriorAidVitalsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerAdditionalVitalSignsOrganizer constraints.validation.error='VitalSignsOrganizerAdditionalVitalSignsOrganizerOrganizer'"
 * @generated
 */
public interface VitalSignsOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerSystolicBloodPressureComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerRespiratoryRateComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerBodyTemperatureComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerOxygenSaturationComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.28\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'46680005\' and value.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateVitalSignsOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerComponent4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerComponent42(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component-&gt;one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateVitalSignsOrganizerComponent43(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignsOrganizer

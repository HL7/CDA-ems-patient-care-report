/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Injury Incident Description Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSInjuryIncidentDescriptionSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSInjuryIncidentDescriptionSectionTemplateId EMSInjuryIncidentDescriptionSectionCode EMSInjuryIncidentDescriptionSectionCodeP EMSInjuryIncidentDescriptionSectionTitle EMSInjuryIncidentDescriptionSectionText EMSInjuryIncidentDescriptionSectionInjuryCauseCategory EMSInjuryIncidentDescriptionSectionTraumaCenterCriteria EMSInjuryIncidentDescriptionSectionInjuryRiskFactor' templateId.root='2.16.840.1.1133883.17.3.10.1.17' templateId.extension='2022-01-01' code.code='67800-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Injury Incident Description Narrative NEMSIS' constraints.validation.warning='EMSInjuryIncidentDescriptionSectionInjuryMechanism' constraints.validation.info='EMSInjuryIncidentDescriptionSectionVehicleImpactArea EMSInjuryIncidentDescriptionSectionPatientLocationInVehicle EMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment EMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus EMSInjuryIncidentDescriptionSectionHeightOfFall EMSInjuryIncidentDescriptionSectionDisasterType'"
 * @generated
 */
public interface EMSInjuryIncidentDescriptionSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.17\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67800-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSInjuryIncidentDescriptionSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryCauseCategory) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryMechanism) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TraumaTriageCriteriaSteps1and2) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TraumaTriageCriteriaSteps3and4) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::VehicleImpactArea) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientLocationInVehicle) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::VehicleOccupantSafetyEquipment) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AirbagDeploymentStatus) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::HeightOfFall) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionHeightOfFall(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DisasterType) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateEMSInjuryIncidentDescriptionSectionDisasterType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryCauseCategory))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::InjuryCauseCategory)'"
	 * @generated
	 */
	InjuryCauseCategory getInjuryCauseCategory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryMechanism))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::InjuryMechanism)'"
	 * @generated
	 */
	InjuryMechanism getInjuryMechanism();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TraumaTriageCriteriaSteps1and2))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::TraumaTriageCriteriaSteps1and2)'"
	 * @generated
	 */
	TraumaTriageCriteriaSteps1and2 getTraumaCenterCriteria();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TraumaTriageCriteriaSteps3and4))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::TraumaTriageCriteriaSteps3and4)'"
	 * @generated
	 */
	TraumaTriageCriteriaSteps3and4 getInjuryRiskFactor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::VehicleImpactArea))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::VehicleImpactArea)'"
	 * @generated
	 */
	VehicleImpactArea getVehicleImpactArea();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientLocationInVehicle))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::PatientLocationInVehicle)'"
	 * @generated
	 */
	PatientLocationInVehicle getPatientLocationInVehicle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::VehicleOccupantSafetyEquipment))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::VehicleOccupantSafetyEquipment)'"
	 * @generated
	 */
	VehicleOccupantSafetyEquipment getVehicleOccupantSafetyEquipment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AirbagDeploymentStatus))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::AirbagDeploymentStatus)'"
	 * @generated
	 */
	AirbagDeploymentStatus getAirbagDeploymentStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::HeightOfFall))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::HeightOfFall)'"
	 * @generated
	 */
	HeightOfFall getHeightOfFall();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DisasterType))-&gt;asSequence()-&gt;any(true).oclAsType(emspcr::DisasterType)'"
	 * @generated
	 */
	DisasterType getDisasterType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSInjuryIncidentDescriptionSection init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSInjuryIncidentDescriptionSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSInjuryIncidentDescriptionSection

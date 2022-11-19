/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition;
import org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability;
import org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement;
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispositionSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Disposition Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSDispositionSectionImpl extends SectionImpl implements EMSDispositionSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSDispositionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_DISPOSITION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionNumberOfPatientsObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionNumberOfPatientsObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTransportModeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTransportModeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTransportMethodObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTransportMethodObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionReasonForChoosingDestinationObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionReasonForChoosingDestinationObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionPrearrivalActivationObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionPrearrivalActivationObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionPrimaryDestinationHospitalCapability(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionPrimaryDestinationHospitalCapability(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionDestinationWard(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionDestinationWard(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionUnitDisposition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionUnitDisposition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionPatientEngagement(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionPatientEngagement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionCrewDisposition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionCrewDisposition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTransportDisposition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTransportDisposition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPatientsTransportedObservation getNumberOfPatientsObservation() {
		return EMSDispositionSectionOperations.getNumberOfPatientsObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportModeObservation getTransportModeObservation() {
		return EMSDispositionSectionOperations.getTransportModeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodObservation getTransportMethodObservation() {
		return EMSDispositionSectionOperations.getTransportMethodObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForChoosingDestinationObservation getReasonForChoosingDestinationObservation() {
		return EMSDispositionSectionOperations.getReasonForChoosingDestinationObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrearrivalActivationObservation> getPrearrivalActivationObservations() {
		return EMSDispositionSectionOperations.getPrearrivalActivationObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionAtDestinationObservation getPatientConditionChangeAtDestinationObservation() {
		return EMSDispositionSectionOperations.getPatientConditionChangeAtDestinationObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationHospitalCapability getPrimaryDestinationHospitalCapability() {
		return EMSDispositionSectionOperations.getPrimaryDestinationHospitalCapability(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationWard getDestinationWard() {
		return EMSDispositionSectionOperations.getDestinationWard(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDisposition getUnitDisposition() {
		return EMSDispositionSectionOperations.getUnitDisposition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientEngagement getPatientEngagement() {
		return EMSDispositionSectionOperations.getPatientEngagement(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrewDisposition getCrewDisposition() {
		return EMSDispositionSectionOperations.getCrewDisposition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportDisposition getTransportDisposition() {
		return EMSDispositionSectionOperations.getTransportDisposition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispositionSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSDispositionSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // EMSDispositionSectionImpl

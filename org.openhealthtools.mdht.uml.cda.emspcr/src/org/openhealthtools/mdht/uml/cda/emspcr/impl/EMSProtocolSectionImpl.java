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

import org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSProtocolSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Protocol Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSProtocolSectionImpl extends SectionImpl implements EMSProtocolSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSProtocolSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_PROTOCOL_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProtocolSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProtocolSectionOperations.validateEMSProtocolSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProtocolSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProtocolSectionOperations.validateEMSProtocolSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProtocolSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProtocolSectionOperations.validateEMSProtocolSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProtocolSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProtocolSectionOperations.validateEMSProtocolSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProtocolSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProtocolSectionOperations.validateEMSProtocolSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProtocolSectionProtocolObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProtocolSectionOperations.validateEMSProtocolSectionProtocolObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProtocolSectionCandidatePatientRegistryType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProtocolSectionOperations.validateEMSProtocolSectionCandidatePatientRegistryType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolObservation> getProtocolObservations() {
		return EMSProtocolSectionOperations.getProtocolObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidatePatientRegistryType getCandidatePatientRegistryType() {
		return EMSProtocolSectionOperations.getCandidatePatientRegistryType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProtocolSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMSProtocolSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //EMSProtocolSectionImpl

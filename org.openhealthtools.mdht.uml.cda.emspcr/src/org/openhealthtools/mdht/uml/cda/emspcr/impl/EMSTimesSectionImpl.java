/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.CallTime;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSTimesSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Times Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSTimesSectionImpl extends SectionImpl implements EMSTimesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSTimesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_TIMES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionCallTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionCallTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionUnitNotifiedTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionUnitNotifiedTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionUnitEnRouteTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionUnitEnRouteTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionUnitOnSceneTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionUnitOnSceneTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionUnitAtPatienttTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionUnitAtPatienttTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionUnitLeftSceneTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionUnitLeftSceneTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionPatientArrivedAtDestinationTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionPatientArrivedAtDestinationTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionUnitBackInServiceTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionUnitBackInServiceTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTimesSectionDispatchNotifiedTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSTimesSectionOperations.validateEMSTimesSectionDispatchNotifiedTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTime getCallTime() {
		return EMSTimesSectionOperations.getCallTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitNotifiedTime getUnitNotifiedTime() {
		return EMSTimesSectionOperations.getUnitNotifiedTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitEnRouteTime getUnitEnRouteTime() {
		return EMSTimesSectionOperations.getUnitEnRouteTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOnSceneTime getUnitOnSceneTime() {
		return EMSTimesSectionOperations.getUnitOnSceneTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAtPatientTime getUnitAtPatienttTime() {
		return EMSTimesSectionOperations.getUnitAtPatienttTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitLeftSceneTime getUnitLeftSceneTime() {
		return EMSTimesSectionOperations.getUnitLeftSceneTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientArrivedAtDestinationTime getPatientArrivedAtDestinationTime() {
		return EMSTimesSectionOperations.getPatientArrivedAtDestinationTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitBackInServiceTime getUnitBackInServiceTime() {
		return EMSTimesSectionOperations.getUnitBackInServiceTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchNotifiedTime getDispatchNotifiedTime() {
		return EMSTimesSectionOperations.getDispatchNotifiedTime(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSTimesSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMSTimesSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //EMSTimesSectionImpl
